# javac -cp classes -d classes $(find src -name "*.java")
javac -cp "lib/*:classFiles" -d classFiles -sourcepath sourceFiles sourceFiles/farming/app/AnimalFarmTest.java
