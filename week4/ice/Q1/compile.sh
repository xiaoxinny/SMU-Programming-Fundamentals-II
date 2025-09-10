# javac -cp classes -d classes -sourcepath src src/farming/type/*.java
# javac -cp classes -d classes -sourcepath src src/farming/*.java
# javac -cp classes -d classes -sourcepath src src/farming/app/AnimalFarmTest.java

javac -cp classes -d classes src/farming/**/*.java
javac -cp classes -d classes $(find src -name "*.java")