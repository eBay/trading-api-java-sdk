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

import javax.xml.transform.TransformerException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.apache.xml.utils.PrefixResolver;
import org.apache.xml.utils.PrefixResolverDefault;
import org.apache.xml.utils.SAXSourceLocator;
import org.apache.xpath.XPath;
import org.apache.xpath.XPathContext;
import org.apache.xpath.objects.XObject;


/**
 * XPath related helper functions.
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: eBay Inc.</p>
 * @author Changyi Zhu
 * @version 1.0
 */
public abstract class XPathUtil {
  /**
   *
   * @param expr String
   * @throws TransformerException
   * @return XPath
   */
  static public XPath createXPath(String expr)
    throws TransformerException
  {
    return createXPath(expr, XPath.SELECT);
  }

  /**
   *
   * @param expr String
   * @param type int
   * @throws TransformerException
   * @return XPath
   */
  static public XPath createXPath(String expr, int type)
    throws TransformerException
  {
    return createXPath(expr, (PrefixResolver)null, type);
  }

  /**
   *
   * @param expr String
   * @param contextNode Node
   * @param type int
   * @throws TransformerException
   * @return XPath
   */
  static public XPath createXPath(String expr, Node contextNode, int type)
    throws TransformerException
  {
    PrefixResolver resolver = new PrefixResolverDefault(contextNode);
    return createXPath(expr, null, resolver, type);
  }

  /**
   *
   * @param expr String
   * @param resolver PrefixResolver
   * @param type int
   * @throws TransformerException
   * @return XPath
   */
  static public XPath createXPath(String expr, PrefixResolver resolver, int type)
    throws TransformerException
  {
    return createXPath(expr, null, resolver, type);
  }

  /**
   *
   * @param expr String
   * @param locator SAXSourceLocator
   * @param resolver PrefixResolver
   * @param type int
   * @throws TransformerException
   * @return XPath
   */
  static public XPath createXPath(String expr, SAXSourceLocator locator, PrefixResolver resolver, int type)
    throws TransformerException
  {
    return new XPath(expr, locator, resolver, type);
  }

  /**
   *
   * @param expr String
   * @param contextNode Node
   * @throws TransformerException
   * @return NodeList
   */
  public static NodeList selectNodes(String expr, Node contextNode)
    throws TransformerException
  {
    return execute(expr, contextNode, XPath.SELECT);
  }

  /**
   *
   * @param expr String
   * @param contextNode Node
   * @throws TransformerException
   * @return Node
   */
  public static Node selectSingleNode(String expr, Node contextNode)
      throws TransformerException
  {
    NodeList nl = execute(expr, contextNode, XPath.SELECT);
    if( nl.getLength() > 0 )
      return nl.item(0);
    else
      return null;
  }


  /**
   *
   * @param expr String
   * @param contextNode Node
   * @param type int
   * @throws TransformerException
   * @return NodeList
   */
  public static NodeList execute(String expr, Node contextNode, int type)
    throws TransformerException
  {
    PrefixResolver resolver = new PrefixResolverDefault(contextNode);
    XPath xpath = createXPath(expr, resolver, type);
    XPathContext xpathContext = new XPathContext();
    XObject xobj = xpath.execute(xpathContext, contextNode, resolver);
    if (xobj != null) {
      return xobj.nodelist();
    }
    else {
      return null;
    }
  }

  /**
   *
   * @param systemId String
   * @param expr String
   * @param contextNode Node
   * @param type int
   * @throws TransformerException
   * @return NodeList
   */
  public static NodeList execute(String systemId, String expr, Node contextNode, int type)
    throws TransformerException
  {
    SAXSourceLocator locator = new SAXSourceLocator();
    locator.setSystemId(systemId);
    PrefixResolver resolver = new PrefixResolverDefault(contextNode);
    XPath xpath = new XPath(expr, locator, resolver, type);
    return execute(xpath, contextNode);
  }

  /**
   *
   * @param xpath XPath
   * @param contextNode Node
   * @throws TransformerException
   * @return NodeList
   */
  public static NodeList execute(XPath xpath, Node contextNode)
    throws TransformerException
  {
    XPathContext xpathContext = new XPathContext();
    XObject xobj = xpath.execute(xpathContext, contextNode, xpathContext.getNamespaceContext());
    if (xobj != null) {
      return xobj.nodelist();
    }
    else {
      return null;
    }
  }

  /**
   *
   * @param xpathContext XPathContext
   * @param xpath XPath
   * @param contextNode Node
   * @throws TransformerException
   * @return NodeList
   */
  public static NodeList execute(XPathContext xpathContext, XPath xpath, Node contextNode)
    throws TransformerException
  {
    XObject xobj = xpath.execute(xpathContext, contextNode, xpathContext.getNamespaceContext());
    if (xobj != null) {
      return xobj.nodelist();
    }
    else {
      return null;
    }
  }
}
