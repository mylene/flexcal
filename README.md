# flexCal

flexCal is a calendar / to do app, inspired by [Above & Beyond] (A&B).

What I like about A&B is the dynamic scheduling. 
Based on your settings, flexCal will automatically create the best schedule for you.



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