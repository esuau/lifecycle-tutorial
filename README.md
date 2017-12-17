# Software Lifecycle Tutorial

A simple Java project using software lifecycle tools:

* Git
* Maven
* JUnit
* Nexus

The program prints the numbers of the [Fibonacci sequence](https://en.wikipedia.org/wiki/Fibonacci_number) in a terminal and displays the tweets including the [#Fibonacci](https://twitter.com/search?q=%23fibonacci) hashtag using the [Twitter4J](http://twitter4j.org/en/index.html) library.    

# Build and run

Build with Maven in a terminal:

```
mvn install
```

Run the `console` module with `java`:

```
cd console/
java -jar target/console-1.0-SNAPSHOT-jar-with-dependencies.jar
``` 