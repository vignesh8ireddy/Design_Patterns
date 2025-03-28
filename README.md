# Design_Patterns

* Design Patterns are the set of rules given as best solutions/practices for re-occurring problems of effective application 
development.
* Every Design Pattern has 3 parts: Problem, Solution and Context.
* The best solution for a problem in a context is called Design Pattern and the worst solution is called Anti Pattern.
* In the 1970s, Christopher Alexander, a civil engineer first documented his experiences in construction as problems and 
solutions which inspired the concept of Design Patterns in the software industry.
* In the 1990s, 4 people, Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides (called Gang of Four) documented and
released the problems and solutions in Object-Oriented Programming as 23 design patterns.
> Eg:: Singleton class, Factory, Builder, Composite, Template, etc.
* In the 2000s, SunMicrosystems had given design patterns in Adv. java and frameworks based on Adv. java.
> Eg:: DAO class, FrontController, ApplicationController, ViewHelper, CompositeView, etc.
* In the 2010s, Microservices architecture (each service of the application is developed as separate independent project)
has become so popular to develop large scale projects, so eventually the design patterns solving problems of microservices
architecture based application development are given.
> Eg:: Aggregator, CircuitBreaker, Chained or Chain of Responsibility, API Gateway, Asynchronous Messaging, etc.
* 3 Major classes of design patterns:
  1. Gang of Four (GoF) Patterns (Core Java, or any OOP language like C++, Python, etc.)
  > Standalone application development needs GoF design patterns.
  2. JEE Patterns (by SunMicrosystems, only Adv. Java and Frameworks)
  > Monolithic Architecture application development needs JEE design patterns and GoF patterns.
  3. Microservices Patterns (Spring Boot Framework and Microservices)
  > Microservices Architecture application development needs Microservices patterns, JEE patterns and GoF patterns.
<pre>
Note: Architecture is end to end plan to develop an application involving multiple layers and flow of execution.
<br> Eg:: MVC Architecture, SOA Architecture, Microservices Architecture, etc.
<br> Design Patterns are the standard solutions for the famous problems while developing logics of each layer in an
architecture.
</pre>

* Terminology related to documenting and releasing a design pattern:
  1. Candidate Pattern (Part of Pattern Identification): When the best solution is found for a reoccurring problem it 
  is marked as a Candidate Pattern. This pattern may become a Design Pattern in the future.
  2. Pattern Template / Pattern Characteristics (Part of detailing the Design Pattern): Using the structure of the 
  Pattern Template, the details of the Candidate Pattern are prepared with following details:
    a. Pattern Name: Having concise and meaningful name for a candidate pattern improves communication among the 
    developers.<br>
    b. Problem: Mention the problem and context where this pattern should be used.<br>
    c. Forces: List of reasons forcing a developer to use this pattern.<br>
    d. Solution: Brief description of how to solve the problem, it has 2 parts, structure (basic diagrammatic 
    description of the solution) and strategy (code snippets showing the implementation of the solution).<br>
    e. Consequences: Pros and Cons of using this candidate pattern.<br>
    f. Related Patterns: List of the other related patterns and their brief description around the problem.<br>
  After comparing the candidate pattern with other related patterns, make it a design pattern if it is not already
  available.
  3. Pattern Catalog (Part of Pattern Categorization): Whenever a new design pattern is created, it must be classified 
  as a Pattern Catalog, doing so helps developers to search and find the design pattern easily.
  <br> GoF Pattern Catalog contains 3 categories:
  <br>
    a. Creation Patterns (deals with object creation)<br>
    b. Structural Patterns (deals with composing large object using smaller objects)<br>
    c. Behavioral Patterns (deals with communication and interaction among the objects)
  <br> JEE Pattern Catalog contains 3 categories:
  <br>
    a. Presentation Tier Patterns <br>
    b. Business Tier Patterns <br>
    c. Integration Tier Patterns <br>

## GoF Patterns

1. Singleton Pattern
  <pre>
  Problem: Waste of Memory and CPU time creating multiple objects for the following java class type:
           a. A class with no state i.e member variable/ properties/ attributes.
           b. A class with fixed read-only state i.e final variables.
           c. A class with shareable state i.e cache/buffer.
  Solution: Develop the java class as singleton class which allows to create only object in any situation.
  </pre>
  * Here are the popular predefined java singleton classes: java.lang.Runtime, java.awt.Desktop,
  org.apache.log4j.Logger, etc.
  * Realtime example, consider a scenario where all the employees in an office working with a single printer device,
  then it is better take Printer as a singleton java class if we design software application for it.
  * Developing a singleton java class with minimum standards
    1. Make 0-parameter constructor and all the other constructors of the class as private to stop outsiders to use 
    new keyword to create objects for the class.
    2. Place one private static reference variable of class type to hold the reference of one object to be created.
    Based on this variable we can check whether single object for the class is already created or not.
    3. Place one static factory method (method that creates object) having singleton logic i.e logic to create object
    by checking the above reference variable.

  <pre>
  Note: Constructor execution does not guarantee object creation
  1. Creating object for the sub-class of an abstract class calls the constructor of the abstract class which doesn't
  mean the object of abstract class is created.
  2. While creating object using Cloning or Deserialization, the constructor would not be called which doesn't mean
  object is not created.
  
  Note: java.lang.Class is a pre-defined class in java.lang package whose objects can hold given class, interface,
  enum and annotation.
  
  Note: Similar to length property of an Array, class is also a built-in property of every class which returns object
  of the java.lang.Class class which holds name and info of current class
  java.lang.Class c1 = Integer.class;
  // Integer.class property returns object of java.lang.Class class holding information about Integer class.
  * java.lang.Class:: pre-defined class whose objects can hold information of any java class
  * .class:: Built-in property of every java class that returns object of java.lang.Class
  * Xxxxx.class file:: contains byte code of Xxxxx class after compilation.
  </pre>

  * The above singleton class can be broken in the following scenarios:
    1. Multithreaded Environment
       * Solutions:
         1. Using synchronized static factory method
         2. Using synchronized block in the static factory method
         3. Using synchronized block with double null checking
         4. Using eager instantiation
         5. Using inner class based lazy instantiation
         6. Using ENUM style singleton
    2. Cloning
       * Solution: Override clone() method of Object class in the singleton class and restricting cloning.
    3. Serializing and Deserializing
       * Solution: Write the readResolve() method in the singleton class restricting its Deserializing.
    4. Reflection API
       * Solution: In the private constructor check if an instance is already available or not and accordingly throw 
       RuntimeException.
    5. Custom Class Loader
       * Solution: No solution from developer side, client side restriction is possible but not effective.
    * Limitations of enum style singleton
      * Cannot use java class features like inheritance.
      * Cannot have member variables, enum can have only enum constants and business methods.
      * Eager instantiation is a bad practice.
    * We cannot make a perfect singleton class because it can be broken with custom ClassLoader subsystem.
    * 3 main uses cases of singleton design pattern are a class with no state, fixed read-only state and shareable data.
2. Factory Pattern
   <pre>
   Problem: superclass and super-interface reference variables can hold objects of their subclasses, client creating 
            object of appropriate subclass for a superclass or super-interface reference variable is not a good
            practice, because expecting client to have all the information about many different subclasses is not good.
   Solution: For every such superclass and super-interface create a Factory class with factory methods that can
            create objects of appropriate class.
   </pre>
   * Factory class internally contains static or non-static factory method that provides abstraction on object 
   creation.
   * Factory method returns one of the several subclass' object based on the data we pass.
   * DriverManager is Factory class with getConnection() factory method, it gives Connection(I) object of many
   databases such as MySql, PostGreSql, MongoDB, etc. based on the parameters we pass into the method.
   * con.createStatement(), st.executeQuery(), and many of the JDBC methods are factory methods.
   * factory.getBean() in spring framework is also a factory method creating object of a spring bean providing
   abstraction over the creation process.
   * In real-time practices, factory class contains static factory method because client is not interested in creating
   Factory class object and moreover, factory class would be developed by one developer and client apps would be
   developed by some other developers, so client apps can only have abstraction of objection creation using factory.
   * Here are some familiar static factory methods: 
     * Thread t = Thread.currentThread(); //returns object of its own class i.e Thread
     * Class c = Class.forName(); //returns object of its own class. i.e java.lang.Class
     * Calender cal = Calender.getInstance() //returns object of related class i.e GreogorianCalender class which subclass of
     Calender
     * Properties properties = System.getProperties() // returns object of java.util.Properties class which is no
     way related to java.lang.System class
     * Connection con = DriverManager.getConnection() // returns object of Connection type which no way related to 
     the DriverManager class
   * Here are some familiar non-static factory methods:
     * String s = new String("hello").concat(" world");
   * 3 types of factory pattern,
     * Factory Pattern : Provides Abstraction on object creation process while creating object of one of the several
     related classes based on the data given.
     * Factory Method Pattern : Defines standards in object creation when multiple factories are creating objects
     for same family classes
     * Abstract Factory Pattern : Super factory or factory of factories i.e make sures the objects created belong to
     the same family/environment
3. Template Method Pattern
   * Template Method Pattern is a method in the super class calling multiple methods in a sequence to complete the
   job. In those multiple methods the common methods will be implemented in super class itself whereas the specific
   the subclass to implement
4. Builder Pattern
   * Creating a complex class directly by defining is not a good practice, builder design pattern says build complex
   class by combining multiple single small classes
   * Main components of Builder Pattern:
     * Product (Let's say House)
     * Builder Interface (HouseBuilder)
     * ConcreteBuilder (WoodenHouseBuilder, ConcreteHouseBuilder)
     * Director (CivilEngineer or HouseArchitect)
     Product is created by using Director which in turn uses Builder
5. Strategy Pattern
   * While developing classes that collaborate/relate with each other i.e  communicate or interact or contain one 
   another it's better to following the following 3 rules
     1. Favour Composition (HAS-A relation) over Inheritance (IS-A relation)
        Limitations of Inheritance:
        * With inheritance code is fragile.
        * Unit testing the code with inheritance is complex and tedious.
        * Not all programming languages support multiple inheritance.
     2. Code to Interfaces/Abstract Classes (i.e Never code to implementation classes or Concrete Classes)
        * Instead of tight coupling go for loose coupling
     3. Code must be open for extension but must be closed for modification.
        * Close code for modification: make the class as final or make all the methods in the class as final.
        * Open for extension: Rule 1 and Rule 2
   * Main components of Strategy Pattern:
     * Target class
     * Multiple Dependant classes
     * Factory class
6. Adapter Pattern
   * This design pattern makes interaction between two incompatible classes possible and efficient.
7. Decorator Pattern (also called Wrapper Pattern)
   * Using inheritance to add new features on the top of a class is sometimes not necessary, so go for Composition.
   * Main components of Decorator pattern
     * Component Interface: The common interface implemented by all concrete classes and decorator classes to make
     them as same type
     * Concrete component class: Classes implementing component interface providing basic objects on which we may
     need to add the additional functionalities
     * Abstract Decorator: The common and abstract super class for all the decorator classes implementing common
     interface type variable as HAS-A property
     * Concrete Decorator: Classes extending abstract decorator having logics to provide additional functionalities
     for the concrete component classes objects
8. Flyweight Pattern
    * Object creation for a class is costly affair in the context of CPU time and memory allocation, Flyweight
    pattern says create minimum no. of objects, keep them in cache and reuse whenever possible.
    * To implement Flyweight pattern, take intrinsic properties (sharable across all objects) of the class as member
    variables and extrinsic properties (properties specific to object) as method parameters (this data comes into
    the object from outside)
    * Flyweight pattern = Identify intrinsic and extrinsic properties of the class + implement factory pattern with
    caching logic.
9. Proxy Pattern
   * Proxy classes are needed to provide extra functionalities by internally using original class.
   * Two types of proxy classes:
     * Manually developed proxy classes (Developed manually by the programmers)
     * Dynamic InMemory Proxy classes (Generated by libraries like CGLIB, JDK,...)
   * Main components of Proxy pattern are:
     * Concrete Interface
     * Concrete class
     * Proxy class
     * Factory class
     * Client
10. Prototype Pattern
    * Prototype patterns says creating objects from scratch level i.e using new operator is costly affair in terms
    cpu time and memory (i.e degrades performance). Instead, cache the original object and if more no. of objects 
    are needed then clone the object present inside cache.

## JEE Patterns

1. DAO Pattern
   * DAO is a java class which contains only persistence logic and nothing else. This creates a flexibility and modularity
   to modify persistence logic with the separation from the other business or presentation logics.
   * If a project has less than 100 database tables then it is better to have only one DAO class per one database table,
   else take one DAO class for 4 or 5 database tables.
   * Use separate ConnectionFactory to create and use the Connection object in multiple DAO classes.
   * DAO class only contains two parts: Query Part, Persistence Operation Part.