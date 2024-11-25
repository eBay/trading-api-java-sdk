# Trading API Java SDK

## Installation Instructions

Please note that upgrades to an SDK should always be done in a test environment and fully tested before used in production.

1. Download the zip file for the version of the eBay SDK for Java that you are using.

2. Note the location of the zip file you downloaded, but before extracting the file, create the following folder: C:\\eBayJavaSDK.

3. Within C:\\eBayJavaSDK, create an "SDKInstallDir" folder to contain the SDK files. You could name that folder according to the Trading API version of the SDK you are installing. For example, for the SDK for Trading API version 1379, you could name the folder _eBayJavaSDK1331_.

4. Go the location of the zip file you downloaded (noted in step 3), and extract the zip file into the SDKInstallDir folder you created in step 4.

5. To build the SDK, see [Building the SDK](#building-the-sdk).(If you're using an Integrated Development Environment (IDE), you do not need to build the SDK, you just need to set the paths to point to the correct libraries and files. See [DevEnvReadme](DevEnvReadme.md) for more information for configuring an IDE)

---

## General Information

* [Development Requirements](#development-requirements)

* [Post-Installation Configuration](#post-installation-configuration)

* [SDK-Related Links](#sdk-related-links)

* [Building the SDK](#building-the-sdk)

* [Documentation](#documentation)

* [Known Issues](#known-issues)

* [Included in the eBay SDK for Java](#included-in-the-ebay-sdk-for-java)

* [WSDL Locations](#wsdl-locations)

* [WSDL Updates](#wsdl-updates)

* [Supported Client Environments](#supported-client-environments)

* [Notes About Logging](#notes-about-logging)

### Development Requirements

- Java SE 8 (JDK8)
- Apache ANT -- Download from [http://ant.apache.org/](http://ant.apache.org/); Ant version 1.6.x or higher is required for all JDKs used with this release.
- JAX-WS RI (Reference Implementation) 2.1.4 -- The version downloaded to SDKInstallDir (the installation directory) at ..\\SDKInstallDir\\lib\\externalLib\\ is the standard (non-customized) version available at the official JAX-WS RI website. You must compile the beta release with this version of the JAX-WS RI. See [Installation Instructions](#InstallationInstructions) for more information about the installation directory.
- For more information on supported client environments, please see [Supported Client Environments](#supported-client-environments).
- It is recommended that you use the latest [Eclipse](http://www.eclipse.org/downloads/) integrated development environment (IDE) for the migration, although you can use any IDE for this release that supports the client environments above. Project files for Eclipse are provided in the installation directory. Please see ..\\SDKInstallDir\\docs\\DevEnvReadme.htm for instructions on using these included project files with Eclipse after installing the JAXB release.
---

[Back to top](#top)

### Post-Installation Configuration

**Note:**

- Update and run setenv.bat(int ..\\SDKInstallDir\\build\\)is necessary only if you want to build the SDK source or run SDK samples from the command line (in a command window).

Modify and run the [setenv.bat](./build/setenv.bat) file as follows:

1.  After upgrading to [Apache Ant 1.6.x, or higher](http://ant.apache.org/), modify the [setenv.bat](./build/setenv.bat) file by adding the bin directory of your ANT installation to the PATH environment variable.
2.  Modify the [setenv.bat](./build/setenv.bat) file so that the JAVA_HOME environmental variable is set to JDK 1.8.x directory.
3.  (Optional) If you have installed Tomcat, set the TOMCAT_HOME environment variable in [setenv.bat](./build/setenv.bat) to the Tomcat location. This step is required only if you wish to run the included JSP samples using Tomcat.
4.  Make sure to run [setenv.bat](./build/setenv.bat) from a command window.

---

[Back to top](#top)

### SDK-Related Links

- [Documentation (including the API Release Notes, which contain tables showing API schema changes)](https://developer.ebay.com/support/)
- [Knowledge Base](https://developer.ebay.com/support/knowledge-base)

---

[Back to top](#top)

## Usage

### Prerequisites

``` text
Maven: version 3.5.0 
Java: 8 or higher
```

### Install

Adding dependency:

```xml
<dependency>
  <groupId>com.ebay.developer</groupId>
  <artifactId>trading-api-sdkcore</artifactId>
  <version>1.0.1-RELEASE</version>
</dependency>

<dependency>
  <groupId>com.ebay.developer</groupId>
  <artifactId>trading-api-ebaycalls</artifactId>
  <version>1.0.1-RELEASE</version>
</dependency>

<dependency>
  <groupId>com.ebay.developer</groupId>
  <artifactId>trading-api-helper</artifactId>
  <version>1.0.1-RELEASE</version>
</dependency>
```

### Building the SDK

In this section, you will use an ANT project file, build.xml, to do the following:

- Generate source code from an eBay WSDL.
- Compile SDK source code.
- Create .jar files (such as ebaysdkcore.jar and ebaycalls.jar) for SDK libraries.

**Note:**

- Building SDK is necessary only for advanced users who have added customization to the SDK source or need to synchronize the source with a new version of eBay Web Services Definition Language(WSDL).

To build the SDK, use the following steps:

1.  Review and follow all the steps in the [Installation Instructions](#InstallationInstructions)

2.  In a command window, change the directory to the SDKInstallDir described in the [Installation Instructions](#InstallationInstructions)

3.  In SDKInstallDir, follow the instructions in [Post-Installation Configuration](#PostInstall) to change 'JAVA_HOME' in the 'setenv.bat' file according to your local JDK installation, then run 'setenv.bat' in command line.

4.  In the same command window, in SDKInstallDir/build, run the following command: ant build,  
    (for a list of available ant tasks, run: ant help)

5.  When a new WSDL is available, advanced users can use it to update the SDK:
6.  Read the Trading API Release Notes. The Release Notes contain changes for Trading API versions released after your current version. The Release Notes are located at the [Trading API Release Notes
](https://developer.ebay.com/Devzone/XML/docs/ReleaseNotes.html).
7.  Download the new WSDL(see [WSDL Locations](#WSDLLocations)) you want to use to SDKInstallDir\\source\\wsdl folder.
8.  At a command prompt, from ...\\SDKInstallDir\\build, run the following command:

```shell
ant build
```
---

[Back to top](#top)

### Documentation

- For the Trading Web Services API Guide, the Trading API Release Notes, and other API documentation (such as the Input/Output Reference and information about API versions), please see the [Welcome to the Trading API User Guide](https://developer.ebay.com/api-docs/user-guides/static/trading-user-guide-landing.html).
- For the Library Reference (javadoc), which includes documentation for the classes in the SDK, please see the following folder: ...\\SDKInstallDir\\docs\\LibRef.
- SDK-related items containing sample code are available in the [Knowledge Base](https://developer.ebay.com/support/knowledge-base), e.g. [Uploading local pictures using Java SDK](https://developer.ebay.com/support/kb-article?KBid=1452).

---

[Back to top](#top)

### Known Issues

- If your eBay SDK for Java application uses GetCategoriesCall to retrieve categories, make sure you set aside a large amount of memory for the Java virtual machine. If the application incurs Out of Memory errors, you should increase the amount of memory dedicated to the JVM.
- Since the wsimport tool cannot generate 'RecipientRelationCodeType' as a Java Enum type from the eBay WSDL, use Java 'String' type instead whenever a 'RecipientRelationCodeType' is expected.

---

[Back to top](#top)

### Included in the eBay SDK for Java

- **[lib](./lib/)**: jar files for eBay SDK for Java:  
  \- ebaysdkcore.jar: the core library  
  \- ebaycalls.jar: the API wrapper library  
  \- eps.jar: the eBay Picture Service library  
  \- attributes.jar: the eBay Attributes API library  
  \- helper.jar: the helper library used in the SDK
- **[srcjar](./lib/srcjar)**: source jar files for eBay SDK for Java.
- **[externalLib](./lib/externalLib/)**: JAX-WS RI and other 3rd party library files. You must compile the SDK with version 2.1.4 of Sun JAX-WS RI.
- **[tutorials](./tutorials)**: tutorials for eBay SDK for Java.
- **[build](./build)**: build files for eBay SDK for Java.
- **[samples](./samples/)**: samples for the eBay SDK for Java. See the [samples readme](./samples/README.md) for details.
- **[source](./source/)**: source code of the eBay SDK for Java.  
  \- [source/core](./source/core/) contains the source code for ebaysdkcore.jar  
  \- [source/apiCalls](./source/apiCalls/): source code for ebaycalls.jar  
  \- [source/helper](./source/helper/): source code for helper.jar  
  \- [source/SanityTest](./source/SanityTest/): source code for Sanity Test Framework

---

[Back to top](#top)

### WSDL Locations

The WSDL is located at https://developer.ebay.com/webservices/_Version_/ebaySvc.wsdl.

_Version_ in the URL means _latest,_ or it means _a numerical version_ of a WSDL release (see the top of the particular WSDL file).

In the case of _Version_ meaning _latest_, the WSDL is the latest released version (https://developer.ebay.com/webservices/latest/ebaySvc.wsdl). If _Version_ in the URL means _a numerical version_ of the WSDL, _Version_ is a number (for example, https://developer.ebay.com/webservices/1379/ebaySvc.wsdl).

Hypothetically, if the latest release of the WSDL were 1379, you would find that WSDL version at both https://developer.ebay.com/webservices/latest/ebaySvc.wsdl and at https://developer.ebay.com/webservices/1331/ebaySvc.wsdl.

---

[Back to top](#top)

### WSDL Updates

- Each version of the eBay SDK for Java is based on a specific WSDL version of the eBay Trading API. eBay updates its WSDL file regularly. Advanced users can use more recent fields and calls by updating the code stubs in their SDK with a more recent WSDL file than the one delivered with the SDK.
- Please note that WSDL updates should always be done in a test environment because WSDL updates can prevent you from using some of the wrapper classes delivered with the SDK. If you update your SDK with a WSDL that contains updated input fields for requests (that is, updated request types), you will need to manually update the affected wrapper classes or use the affected request objects directly, without wrappers.
- To update the code stubs in your SDK with a more recent WSDL file, please see related instructions in [Building the SDK](#BuildInformation).

---

[Back to top](#top)

### Supported Client Environments

eBay has tested the eBay SDK for Java using the following client environments:

- Sun JAX-WS RI 2.1.4
- Java SE 8 on Windows 10

**Note:** You can use any integrated development environment (IDE) with the eBay SDK for Java, as long as it supports the above environments.

---

[Back to top](#top)

### Notes About Logging

Starting with SDK version 687, the eBay SDK uses the Simple Logging Facade for Java (SLF4J), a simple facade for various logging frameworks, e.g. log4j, java.uitl.logging (also referred to as JDK 1.4 logging).

By default, eBay SDK uses log4j as the underlying logging framework. To let log4j work properly, you need to configure log4j beforehand. For example, you can configure log4j in the log4j.properties file and put this file in the classpath of your application (for a sample log4j.properties file, please refer to the SDK sample consoleAddItem, in {SDKRoot}\\samples\\consoleAddItem\\src\\main\\resources).

If you want to switch to another logging framework such as java.util.logging, you need to remove slf4j-log4j12-1.6.1.jar and log4j-1.2.16.jar from your classpath, then add slf4j-jdk14-1.6.1.jar (in {SDKRoot}\\lib\\externalLib\\optional\\slf4j-1.6.1) in your classpath. For details about how to configure java.util.logging, please refer to Java SDK documentation.

For more details about SLF4J, please refer to [its official site](http://www.slf4j.org/index.html).

SDK logging can be further configured by setting ApiContext instance accordingly, for example, if you want to disable SOAP payload logging (by default, it is enabled), just call setLogSOAPMessages (false) on the ApiLogging instance (property of ApiContext). For more settings of ApiLogging, please refer to SDK library reference.

---

[Back to top](#top)

---

© 2024 eBay Inc. All rights reserved.
