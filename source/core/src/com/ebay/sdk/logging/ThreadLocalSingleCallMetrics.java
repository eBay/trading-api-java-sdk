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
 * This class provides a thread local SingleCallMetrics, so that during the execution
 * of the thread, different classes can access the metrics object to log information.
 * 
 * @author wdeng
 *
 */
public class ThreadLocalSingleCallMetrics
{
	private static final ThreadLocal<SingleCallMetrics> THREAD_LOCAL = new ThreadLocal<SingleCallMetrics>();

	public static SingleCallMetrics getSingleCallMetrics()
	{
		return THREAD_LOCAL.get();
	}

	public static void resetSingleCallMetrics()
	{
		THREAD_LOCAL.set(new SingleCallMetrics());
	}
}
