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

import java.io.PrintStream;
import java.util.Date;
import com.ebay.sdk.util.eBayUtil;

/**
 * A class to keep metrics for a single API call.
 * 
 * @author wdeng
 *
 */
public class SingleCallMetrics  
{
	private String callname;
	private long apiCallStarted;
	private long getSocketConnectionStarted;
	private long getSocketConnectionEnded;
	private long socketReadStarted;
	private long apiCallEnded;
	private long serverProcessingTime;
	private long sdkJAXBCallInvokeStarted;
	private long sdkJAXBCallInvokeEnded;
	
	/**
	 * @return sdkJAXBCallInvokeStarted long
	 */
	public long getSdkJAXBCallInvokeStarted(){
		return sdkJAXBCallInvokeStarted;
	}
	
	/**
	 * @return sdkJAXBCallInvokeEnded long
	 */
	public long getSdkJAXBCallInvokeEnded(){
		return sdkJAXBCallInvokeEnded;
	}
	
	/**
	 * @return apiCallEnded long
	 */
	public long getApiCallEnded() {
		return apiCallEnded;
	}

	/**
	 * @return apiCallStarted long
	 */
	public long getApiCallStarted() {
		return apiCallStarted;
	}

	/**
	 * @return getSocketConnectionEnded long
	 */
	public long getSocketEnded() {
		return getSocketConnectionEnded;
	}

	/**
	 * @return getSocketConnectionStarted long
	 */
	public long getSocketStarted() {
		return getSocketConnectionStarted;
	}


	/**
	 * @return socketReadStarted long
	 */
	public long getSocketReadStarted() {
		return socketReadStarted;
	}
	
	/**
	 * @param l long
	 */
	public void setSdkJAXBCallInvokeStarted(long l){
		sdkJAXBCallInvokeStarted = l;
	}

	/**
	 * @param l long
	 */
	public void setSdkJAXBCallInvokeEnded(long l){
		sdkJAXBCallInvokeEnded = l;
	}
	
	/**
	 * @param l long
	 */
	public void setApiCallEnded(long l) {
		apiCallEnded = l;
	}

	/**
	 * @param l long
	 */
	public void setApiCallStarted(long l) {
		apiCallStarted = l;
	}

	/**
	 * @param l long
	 */
	public void setGetSocketEnded(long l) {
		getSocketConnectionEnded = l;
	}

	/**
	 * @param l long
	 */
	public void setGetSocketStarted(long l) {
		getSocketConnectionStarted = l;
	}


	public void setServerProcessingTime(long l) {
		serverProcessingTime = l;
	}

	/**
	 * @param l long
	 */
	public void setSocketReadStarted(long l) {
		socketReadStarted = l;
	}

	public long getTurnaroundTime()
	{
		return getTimeInterval(getApiCallStarted(), getApiCallEnded());
	}
	
	public long getPreJAXBInvokeTime(){
		return getTimeInterval(getApiCallStarted(), getSdkJAXBCallInvokeStarted());
	}
	
	public long getPostJAXBInvokeTime(){
		return getTimeInterval(getSdkJAXBCallInvokeEnded(), getApiCallEnded());
	}


	public long getSocketConnectionTime()
	{
		return getTimeInterval(getSocketStarted(), getSocketEnded());
	}

	/*public long getNetworkAndServerTime()
	{
		return getTimeInterval(getSocketEnded(), getSocketReadStarted());
	}*/

	public long getNetworkAndServerTime()
	{
		return getTimeInterval(this.getSdkJAXBCallInvokeStarted(), this.getSdkJAXBCallInvokeEnded());
	}
	
	public long getServerProcessingTime()
	{
		return serverProcessingTime;
	}

	public long getNetworkTime()
	{
		return getTimeInterval(getServerProcessingTime(), getNetworkAndServerTime());
	}

	private long getTimeInterval(long start, long end)
	{
		if (start == 0 || end == 0)
		{
			// one of the time is not recorded, returns -1.
			return -1;
		}
		return end - start;
	}
	
	public void generateReport(PrintStream ps)
	{
		CallMetrics.printOneNumber(ps, getTurnaroundTime());
		CallMetrics.printOneNumber(ps, getPreJAXBInvokeTime());
		CallMetrics.printOneNumber(ps, getPostJAXBInvokeTime());
		
		//CallMetrics.printOneNumber(ps, getPreAxisInvokeTime());
		//CallMetrics.printOneNumber(ps, getSocketConnectionTime());
		CallMetrics.printOneNumber(ps, getNetworkTime());
		CallMetrics.printOneNumber(ps, getServerProcessingTime());
		//CallMetrics.printOneNumber(ps, getResponseReceivingTime());
		//CallMetrics.printOneNumber(ps, getPostAxisInvokeTime());
		
		Date date = new Date(this.getApiCallStarted());
		CallMetrics.printOneString(ps, eBayUtil.toAPITimeString(date), 20);
		ps.println();		
	}
	
	void updateTotals(long[] totals)
	{
		totals[0] += getTurnaroundTime();
		totals[1] += getPreJAXBInvokeTime();
		totals[2] += getPostJAXBInvokeTime();
		
		//totals[1] += getPreAxisInvokeTime();
		//totals[2] += getSocketConnectionTime();
		totals[3] += getNetworkTime();
		totals[4] += getServerProcessingTime();
		//totals[5] += getResponseReceivingTime();
		//totals[6] += getPostAxisInvokeTime();
		
	}
	/**
	 * @return callname String
	 */
	public String getCallname() {
		return callname;
	}

	/**
	 * @param string
	 */
	public void setCallname(String string) {
		callname = string;
	}

}
