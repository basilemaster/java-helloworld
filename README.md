# java-helloworld
A java-helloworld is traditionally used to introduce novice programmers to Java programming language.

# To compile only
mvn compile
# To clean and compile
mvn clean compile

# To compile and run
mvn compile exec:java -Dexec.mainClass="com.mbali.primetechno.it.helloword.Main"
mvn compile exec:java

# To build the package only
mvn package

# To build a package and run
mvn package exec:java -Dexec.mainClass="com.mbali.primetechno.it.helloword.Main"
mvn package exec:java

# To run only, hopying it has been compile first
mvn exec:java -Dexec.mainClass="com.mbali.primetechno.it.helloword.Main"
mvn exec:java

