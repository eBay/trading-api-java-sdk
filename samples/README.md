# Samples in the eBay SDK for Java

*   Each sample has a readme.htm that contains build, usage or design information about the sample. 
*   Each sample has an ANT project file (build.xml) that is used to build the sample source code. You can execute "ant compile" (in each sample folder) to build each sample. Make sure that first you update your SDK (see the readme.htm file in the eBay SDK for Java install directory). Additionally, confirm that you have set the environment variable JAVA\_HOME correctly because it is needed by ANT. It is recommended to set and run setenv.bat in the build folder of SDK to set environment variables first.
*   A sample can be launched using the ANT project file build.xml. Typically you can run "ant" or "ant run"to launch a console or swing application.

### [helloWorld](helloWorld/readme.md) (Console)

    The most basic sample to let you get started with eBay SDK/API.

### [consoleAddItem](consoleAddItem/readme.md) (Console)

    A simple console application that creates an item and list it to eBay. It prompts user to enter account and the new item information then uses AddItemCall to list the new item to eBay.

### [consoleAddFixedPriceItem](consoleAddFixedPriceItem/readme.md) (Console)

    A simple console application that creates an item and list it to eBay. It prompts user to enter account and the new item information then uses AddFixedPriceItemCall to list the new item to eBay.

### [consoleAddItemDirect](consoleAddItemDirect/readme.md) (Console)

    This is a sample console application that shows how to create a new item and list it to eBay (using AddItemCall) without using the AddItemCall wrapper class. 

### [consoleViewItem](consoleViewItem/readme.md) (Console)

    A simple console application that displays item information by given Item ID. It prompts user to enter account information and the Item ID then uses GetItemCall to retrieve item details from eBay.

### [consoleViewItemOAuthToken](consoleViewItemOAuthToken/readme.md) (Console)

    A simple console application that displays item information by given Item ID. It prompts user to enter OAuth Token and the Item ID then uses GetItemCall to retrieve item details from eBay.

### [simpleXmlPost](simpleXmlPost/readme.md) (SWING)

    It demonstrates how to use ApiSchemaBasedXmlPoster class to send eBay API XML to make traditional (non-SOAP) XML API call.

### [signinRedirect](signinRedirect/readme.md) (JSP sample)

    A JSP sample for generating a token for an individual eBay user.