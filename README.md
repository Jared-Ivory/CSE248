# CSE248 Class Notes

##### 11/07: Databases

Foreign Keys are used to link tables together. Much like a linked list. Can be null.

Primary Keys identify the data. *Must be Unique nor Null*

Only specific types of data are allowed into the database

![Image](https://i.imgur.com/HVSDyTr.png)

Foreign Keys link tables together.

Sakila customer
	
    |- address_id --> Address contains city_id
		| - city_id --> City contains country_id
			| - country_id --> Country
		

##

##### 11/05: Front End/Back End

**Front End:**

Web App-
* HTML, JS
Mobile App-
* XML, Java, Swift, Objective C

**Back End:**

* Java EE
* Node.js
* etc...

_Essential Components:_

1. Application Server
2. Web Server
3. Database Server 

___HOW THEY INTERACT:___

* REST - REpresentational State Transfer.
* "It would be nice if computers could understand each other" - creator of REST.
* Client must be able to interpret SQL and interact with a database.

__Goals:__

* Make data human readable. (Ex. Text files)
* Tagged data.
* Doesn't matter what language you use as long as you interpret data.
* Applies a server called an API.
* Client asks for data in XML or JSON.
* Client side then parses the data and updates UI.

__Notes:__

* Spring boot comes with built in functions to accomplish restful operations.
* OpenWeatherMap
* SoapUI
* Postman API

##

##### 10/31: Databases
- MySql Server Community Edition
- MySql WorkBench
- MySql Connector/J (Driver)

## 

##### 10/17: UML Extended:

Final Project UML
- Use Case Diagram
- Class Diagram

___Association___ is the weakest relationship

___Aggregation___ is closer than association and it means belongs. (Clear Diamond)

___Composition___ closet relationship. Tightly related.(Filled Diamond)

##

  
  ##### 10/15: Exam 1 Review
  ##### What is the purpose of a server?
  To allow a user to store data and to help clients connect with one another. 
  
  ##### How do client servers interact with one another?
  	
  Through an __*API (Application Program Interface)*__
  
  ##### What is the process in developing a typical web application?
   
 Agile development (see __9/26 notes__). Dividing the project into various features and multiple steps. Then you are able to test the individual components of the projects and troubleshoot individual sections.
 
 ##### What are the typical components of an Web/Mobile application?
 
 If you were able to describe the components of say an android application or a web application you would have gotten credit.
 
 ##### Breakdown the MVC product design.
 
 View - Holds what the client sees and interactions. __Should only have the methods necessary to draw to UI. *No business logic*__
 
 Controller - Holds the business logic of an application
 
 Model - Java code for all the data needed within the product.
 
##

##### Spring

[Spring Boot vs SpringMVC](https://www.javadevjournal.com/spring-boot/spring-boot-vs-spring-mvc/)
 
[Spring Boot Tutorial](https://auth0.com/blog/developing-a-restful-client-with-retrofit-and-spring-boot/?utm_source=reddit&utm_medium=sc&utm_campaign=retrofit_spring)
 
## 
 
##### UML (Unified Modeling Diagram) design - [link](https://www.uml-diagrams.org/)
 
 > A __*UML diagram*__ is a diagram based on the __*UML (Unified Modeling Language)*__ with the purpose of visually representing a system along with its main __*actors, roles, actions, artifacts or classes*__, in order to better __*understand, alter, maintain, or document*__ information about the system.
 
 ![Image of UML Diagram](https://d3n817fwly711g.cloudfront.net/uploads/2012/02/UML-Diagram-types-1-1024x658.png)
 
 
##

  #### 9/26: Agile vs Waterfall - [link](http://www.agilenutshell.com/) 
  Introduction to workflows withinin proffessional environments. Helps to create a clear and concise direction of a projects direction.
  
 ##

