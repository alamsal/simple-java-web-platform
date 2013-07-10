Simple java platform
========================

This project is to demonstrate a simple java webplatform that can be contained in an executable war.

How To Build and Run
====================

The project requires [gradle](http://www.gradle.org/) to build

To build and run from the command line:

1. cd where_ever_the_folder_is
2. gradle clean build
3. java -jar build/libs/java-web-platform.war


Current Issues
==============

I want to solve the problem with why the JSTL libraries require the URI of http://java.sun.com/jstl/core_rt to run instead of http://java.sun.com/jsp/jstl/core. I have a stack overflow question here: http://stackoverflow.com/questions/17580101/why-jstl-works-when-uri-defined-as-jstl-core-rt-but-not-jsp-jstl-core-in-embed
