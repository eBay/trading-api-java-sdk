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

package com.ebay.sdk.util;

import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.ArrayList;

/**
*
* <p>Title: SdkProxySelector</p>
* <p>Description: utility class for http proxy setting</p>
* <p>Copyright: Copyright (c) 2009</p>
* <p>Company: eBay Inc.</p>
* @author boyang
* @version 1.0
*/
public class SdkProxySelector extends ProxySelector {
	
	private ArrayList<Proxy> proxies = new ArrayList<Proxy>();

	/**
	 * constructor, create a basic ProxySelector.
	 */
	public SdkProxySelector(String proxyHost, int proxyPort) {
		SocketAddress sa = new InetSocketAddress(proxyHost, proxyPort);
		Proxy p = new Proxy(Proxy.Type.HTTP, sa);
		proxies.add(p);
	}
	
	/**
	 * constructor, create a ProxySelector with username/password authentication.
	 */
	public SdkProxySelector(String proxyHost, int proxyPort, String username, String password) {
		this(proxyHost, proxyPort);
		
		final String _username = username;
		final String _password = password;
		
	    Authenticator.setDefault(new Authenticator() {
	        protected PasswordAuthentication getPasswordAuthentication() {
	          return new
	             PasswordAuthentication(_username, _password.toCharArray());
	      }});
	}
	
	/**
	 * Method called by the handlers when it failed to connect
	 * to one of the proxies returned by select().
	 */
	@Override
	public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
		throw new RuntimeException("fail to connect to the proxy server: " + sa.toString(), ioe);
	}

	/**
	 * This is the method that the handlers will call.
	 * Returns a List of proxy.
	 */
	@Override
	public List<Proxy> select(URI uri) {
		return proxies;
	}
	
	/**
	 * register this ProxySelector, let the proxy setting take effect.
	 */
	public void register() {
		ProxySelector.setDefault(this);
	}

}
