    CACTUS FRAMEWORK
    
1.What is the project about:

Simple Java project for tests automation. The project is for everyone who wants to start writing 
front-end functional automation tests. But with some work you can implement some 'RestTemplate' and
start writing API tests. The project is configured and ready for use. It is developed for MAC but with
some work on the dependencies it will match all OS.

2.What technologies do the project use:

The project is Maven, it is written in Java version: 1.8, for unit-test framework we are using TestNG.
The framework is using PageObjectModel design pattern. 

3.Project structure:

The project is separated in two parts, one for the framework and one for the tests.
Package 'framework' is for all framework related logic, pages, utilities, navigation, basically
everything that is not 'Test-class'.
Package 'tests' is were all tests are going, every test should be paced in the 'tests' package.
The reason which we are separating the framework in two is that if we have code refactoring and we 
need to refactor our framework, the only change it should be made is in the 'framework' package.

