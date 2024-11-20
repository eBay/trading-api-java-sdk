STEPS TO RUN SAMPLE USING MAVEN

Prerequisite
- JDK 1.8 or later

STEP 1:
Before you can run this sample using maven, you need to add SDK jars to
your local maven repository, there are 3 jars in {SDK}\lib folder:
ebaysdkcore.jar, ebaycalls.jar, helper.jar.
For each of those 3 jars, do
------------------------------------------
mvn install:install-file -DgroupId=com.ebay
-DartifactId=<artifact_id>
-Dversion=<version_number>
-Dfile=<jar_name>.jar
-Dpackaging=jar
------------------------------------------

STEP 2:
Ensure the SDK dependency in pom.xml is correct, you may need to update
the artificatId if it is different from your installed artifactId.

STEP 3:
use following command to run the sample
------------------------------------------
mvn -e clean compile exec:java
------------------------------------------

Notes:
The sample was tested with following configuration-
- Java 1.8
- Maven 2.2.1

 