[![Build Status](https://travis-ci.org/mylene/flexCal.svg?branch=master)](https://travis-ci.org/mylene/flexCal) &nbsp;
[![codecov](https://codecov.io/gh/mylene/flexCal/branch/master/graph/badge.svg)](https://codecov.io/gh/mylene/flexCal) &nbsp;
[![Known Vulnerabilities](https://snyk.io/test/github/mylene/flexCal/badge.svg)](https://snyk.io/test/github/mylene/flexCal) &nbsp;
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/7ed9af0b84d14df3b5e4aafaf464b095)](https://www.codacy.com/app/mylenereiners/flexCal_2?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=mylene/flexCal&amp;utm_campaign=Badge_Grade)  &nbsp;
<a href="https://scan.coverity.com/projects/mylene-flexcal">
  <img alt="Coverity Scan Build Status"
       src="https://scan.coverity.com/projects/18561/badge.svg"/>
</a>

# flexCal

flexCal is a calendar / to do app, inspired by [Above & Beyond] (A&B).

What I like about A&B is the dynamic scheduling. 
Based on your settings, flexCal will automatically create the best schedule for you.

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