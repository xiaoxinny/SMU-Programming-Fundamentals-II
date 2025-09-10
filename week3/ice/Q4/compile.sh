#!/bin/bash
# Compile Java source files into the classes/ folder
mkdir -p classes

# Add all JARs in lib/ to classpath
CP="classes:lib/*"

javac -cp "$CP" -d classes -sourcepath src src/ticketing/test/TicketUtilityTest.java