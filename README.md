# vaadin-test
OFBiz application based on Spring and Vaadin

## Features
+ use OFBiz Dispatcher and Delegator as Spring managed beans
+ ...

## Quick start
1. Download https://github.com/yuri0x7c1/vaadin-test/releases/download/0.0.1-SNAPSHOT/apache-ofbiz-16.11.03_vaadin-test-0.0.1-SNAPSHOT.7z file
2. Extract and run `gradlew ofbiz`
3. Go to https://localhost:8443/vaadin-test

## Build Instructions
1. Download and unpack apache-ofbiz-16.11.xx from official OFBiz site http://ofbiz.apache.org/download.html
2. Change spring-test dependency `compile 'org.springframework:spring-test:4.x.x.RELEASE` to `compile 'org.springframework:spring-test:4.3.9.RELEASE` in OFBiz build.gradle configuration file
3. Delete all applications except ecommerce from OFBiz specialpurpose directory and from component-load.xml configuration file
4. Build OFBiz with command `gradlew build`
5. Create OFBiz component with command `gradlew createPlugin -PpluginId=vaadin-test`
6. Delete all files from OFBiz specialpurpose/vaadin-test/webapp/vaadin-test directory
7. Change path to ofbiz.jar in pom.xml `/path/to/ofbiz/build/libs/ofbiz.jar`
8. Build vaadin-test application with command `mvn clean install package`
9. Copy vaadin-test/target/vaadin-test-0.0.1-SNAPSHOT directory content to OFBiz specialpurpose/vaadin-test/webapp/vaadin-test directory
10. Go to installed OFBiz directory and load demo data with command `gradlew loadDefault`
11. Run OFBiz with command `gradlew ofbiz` and go to https://localhost:8443/vaadin-test
