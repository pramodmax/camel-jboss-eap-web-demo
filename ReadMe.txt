Camel Java Router Project
=========================

=== How to build

To build this project use

Edit the {project-path}/src/main/resources/application.properties
Change the value of input.folder to required folder path.

Do a build using
```
mvn clean install
```
=== How to run

You can run this example by copying it to JBoss EAP deployment folder
camel-jboss-eap-web-demo.war

Place a file in "input.folder"

You should see  the response as below in the console
```
Processing file: 1.txt
File Content: Hello world.....
```
=== More information

You can find more information about Apache Camel at the website: http://camel.apache.org/