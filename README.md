[![Build Status](https://travis-ci.org/mylene/flexCal.svg?branch=master)](https://travis-ci.org/mylene/flexCal) &nbsp;
[![codecov](https://codecov.io/gh/mylene/flexCal/branch/master/graph/badge.svg)](https://codecov.io/gh/mylene/flexCal) &nbsp;
[![Known Vulnerabilities](https://snyk.io/test/github/mylene/flexCal/badge.svg)](https://snyk.io/test/github/mylene/flexCal) &nbsp;



# flexCal

flexCal is a calendar / to do app, inspired by [Above & Beyond] (A&B).

What I like about A&B is the dynamic scheduling. 
Based on your settings, flexCal will automatically create the best schedule for you.

-----

2019-06-11

Removed some badges, added other ones (to test, and just because I could :)

[![Code Inspector](https://www.code-inspector.com/project/157/status/svg)](https://www.code-inspector.com/public/project/157/flexCal/dashboard) &nbsp; 
[![CodeFactor](https://www.codefactor.io/repository/github/mylene/flexcal/badge)](https://www.codefactor.io/repository/github/mylene/flexcal) &nbsp;
[![Total alerts](https://img.shields.io/lgtm/alerts/g/mylene/flexCal.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/mylene/flexCal/alerts/) &nbsp;
[![Language grade: JavaScript](https://img.shields.io/lgtm/grade/javascript/g/mylene/flexCal.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/mylene/flexCal/context:javascript) &nbsp;
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=mylene_flexCal&metric=alert_status)](https://sonarcloud.io/dashboard?id=mylene_flexCal)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=mylene_flexCal&metric=sqale_index)](https://sonarcloud.io/dashboard?id=mylene_flexCal)




-----
2019-06-07

Created base Microservice dateMan (going to be used for date manipulation) using [helidon.io](http://helidon.io), copied base application, 
updated it to Java 12 and modularised (Jigsaw) it.

Added some badges (kind of useful BTW. They check the status of the application). For more information on this check my [vOO repository].

-----
2019-06-06

Decided to convert from Gradle to Maven (at least for the time being). I'm just more comfortable using Maven.    
Steps taken: 
1. Add id 'maven' to the plugins section of the build.gradle file
1. Run gradle install
1. Copy the build/poms/pom-default.xml to the root, and rename it to pom.xml
1. Fill in the groupId and the version tags
1. Add the compiler plugin to be able to use Java 12 (or whatever version you prefer)
1. Run mvn clean
1. Remove all unwanted dependencies (if any)
1. Run mvn install
1. Remove gradle related stuff (in IntelliJ: detach gradle,
   remove build.gradle, and whatever remains)
   
   
   




<!--- Links -->
[Above & Beyond]: http://www.1soft.com/aandb.html
[vOO repository]: https://github.com/mylene/vOO/