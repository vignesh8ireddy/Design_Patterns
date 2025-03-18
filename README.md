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
  1. Candidate Pattern (Part of Pattern Identification)
  <br> When the best solution is found for a reoccurring problem it is marked as a Candidate Pattern. This pattern may
  become a Design Pattern in the future.
  2. Pattern Template / Pattern Characteristics (Part of detailing the Design Pattern)
  <br> Using the structure of the Pattern Template, the details of the Candidate Pattern are prepared with following 
  details:
  <br>
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
  3. Pattern Catalog (Part of Pattern Categorization)
  <br> Whenever a new design pattern is created, it must be classified as a Pattern Catalog, doing so helps developers
  to search and find the design pattern easily.
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
* GoF Patterns
  * Creation Patterns
    1. Singleton Pattern
    <pre>
    Problem: Waste of Memory and CPU time creating multiple objects for the following java class type:
             a. A class with no state i.e member variable/ properties/ attributes.
             b. A class with read-only state i.e final variables.
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
           3. Using synchronized block with double null checking (Best)
           4. Using eager instantiation
           5. Using inner class based lazy instantiation (best2)
           6. Using ENUM style singleton (best3)