/*
 * Copyright (c) 2024 eBay Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package com.ebay.sdk.logging;

/**
 * This is the interface class for this logging package. It contains methods for 
 * enabled logging, prepare to log for a single call, etc.
 * 
 * @author wdeng
 *
 */
public class MetricsLogger 
{

	public static final String KEY_METRICS_LOGGING_ENABLED = "com.ebay.sdk.MetricsLogging";
	
	public static void enableMetricsLogging()
	{
	  System.setProperty(KEY_METRICS_LOGGING_ENABLED, "true");
	}
	
	public static boolean metricsLoggingEnabled()
	{
		String property = System.getProperty(KEY_METRICS_LOGGING_ENABLED);
		return property != null && "true".equalsIgnoreCase(property);
	}
	
	public static void 	startRecordingSingleCallMetrics(String apiName)
	{
		if (!metricsLoggingEnabled())
		{
			return;
		}
		ThreadLocalSingleCallMetrics.resetSingleCallMetrics();
		SingleCallMetrics metrics = ThreadLocalSingleCallMetrics.getSingleCallMetrics();
		metrics.setCallname(apiName);
		metrics.setApiCallStarted(System.currentTimeMillis());
	}
	
	
	public static SingleCallMetrics endRecordingSingleCallMetrics()
	{
		if (!metricsLoggingEnabled())
		{
			return null;
		}
		SingleCallMetrics metrics = ThreadLocalSingleCallMetrics.getSingleCallMetrics();
		metrics.setApiCallEnded(System.currentTimeMillis());
		return metrics;
	}
	
	public static SingleCallMetrics getSingleCallMetrics()
	{
		if (!metricsLoggingEnabled())
		{
			return null;
		}
		return ThreadLocalSingleCallMetrics.getSingleCallMetrics();
	}
	
	public static void collectMetrics(CallMetrics metrics)
	{
		if (!metricsLoggingEnabled())
		{
			return;
		}
		SingleCallMetrics singleMetrics = ThreadLocalSingleCallMetrics.getSingleCallMetrics();
		if (null == singleMetrics)
		{
			return;
		}
		metrics.addCallMetrics(singleMetrics);
	}
	
	public static void startSdkJAXBCallInvoke(){
		if (!metricsLoggingEnabled())
		{
			return;
		}
		SingleCallMetrics metrics = ThreadLocalSingleCallMetrics.getSingleCallMetrics();
		metrics.setSdkJAXBCallInvokeStarted(System.currentTimeMillis());
	}
	
	public static void recordServerProcessingTime(long l){
		if (!metricsLoggingEnabled())
		{
			return;
		}
		SingleCallMetrics metrics = ThreadLocalSingleCallMetrics.getSingleCallMetrics();
		metrics.setServerProcessingTime(l);
	}
	
	public static void endSdkJAXBCallInvoke(){
		if (!metricsLoggingEnabled())
		{
			return;
		}
		SingleCallMetrics metrics = ThreadLocalSingleCallMetrics.getSingleCallMetrics();
		metrics.setSdkJAXBCallInvokeEnded(System.currentTimeMillis());
	}
}
