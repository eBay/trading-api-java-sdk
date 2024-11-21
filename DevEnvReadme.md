Using Development Environments
------------------------------

Please use the development environment of your choice with the eBay SDK for Java. Project files are provided for use of [Eclipse](http://www.eclipse.org/).

### Using Eclipse with the eBay SDK for Java

**Note:** The root Eclipse project is the JavaSDK project, located at SDKInstallDir\.project. Some other Eclipse projects depend on the JavaSDK project. If other Eclipse projects are opened, they should be opened using the same workspace as the JavaSDK project.

To use Eclipse with the eBay SDK for Java:

1.  Start Eclipse.
2.  On the File menu, click Import.
3.  In the Import dialog, click General, click Existing Projects Into Workspace, and then click Next.
4.  In the Select Root Directory box, click Browse, specify the eBay SDK for Java installation directory, you will see 'JavaSDK' is listed in the Projects list, click Finish.
5.  Confirm that Eclipse performed the compilation that created the classes of the eBay SDK for Java.
6.  The following samples contain Eclipse projects: apiCallsDemo, configTest, consoleAddItem, consoleAddItemDirect, consoleViewItem, simpleXmlPost. If you want to use one of these samples in Eclipse, import its Eclipse project. The samples are located at SDKInstallDir\\samples.
7.  Import the following Eclipse project: SDKInstallDir\\source\\PerfTest\\.project, if you want to perform a simple performance test.
8.  If you want to use the Sanity Test Framework (under the source/SanityTest folder) for simple testing after you change code in the SDK, you can import the following project: SDKInstallDir\\source\\SanityTest\\.project. To use the Sanity Test Framework, you must also install JUnit (to the externalLib folder) from http://www.junit.org/index.htm.