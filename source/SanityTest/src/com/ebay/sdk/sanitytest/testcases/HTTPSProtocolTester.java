package com.ebay.sdk.sanitytest.testcases;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.ebay.sdk.sanitytest.SDKTestCase;

public class HTTPSProtocolTester extends SDKTestCase {
    public void test_https_with_sys_property() {
        try {
            //			System.setProperty("java.protocol.handler.pkgs",
            //		        				"com.sun.net.ssl.internal.www.protocol");
            //			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            URL url = new URL("https://www.microsoft.com");
            URLConnection con = url.openConnection();
            InputStream istream = con.getInputStream();
            assertNotNull(istream);
        } catch (MalformedURLException mfe) {
            fail("**** Failed creating URL *******");
        } catch (IOException ioe) {
            fail(
                "**** Failed creating URLConnection or getting InputStream *******");
        }
    }

    public void test_https_no_sys_property() {
        try {
            URL url = new URL("https://www.microsoft.com");
            URLConnection con = url.openConnection();
            InputStream istream = con.getInputStream();
            assertNotNull(istream);
        } catch (MalformedURLException mfe) {
            fail("**** Failed creating URL *******");
        } catch (IOException ioe) {
            fail(
                "**** Failed creating URLConnection or getting InputStream *******");
        }
    }
}
