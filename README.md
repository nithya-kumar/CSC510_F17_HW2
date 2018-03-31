# HW2
## CSC 510 (Software Engineering) F17 HW2  
The HW contains the following parts.
### PATTERNS
#### OO Patterns

Define and describe 2 design patterns from each of the following category,
``` 
1. Creational Patterns
2. Structural patterns
3. Behavioral patterns
```
**Creational Design Patterns**  
  Let us see the details about Singleton pattern and Builder pattern
  * **Singleton Pattern**  
    * **Intent**  
      The intent of Singleton pattern is to ensure that a class has only one instance and provides a global point of access to it
    * **Problem**  
    Any application using Singleton pattern needs one, and only one instance of an object. Also, well-known access points to all clients in the form of global access should be present. Lazy initialization is necessary.
    * **Benefits**  
      * Provider controls accesss to the single instance
      * Reduced namespace
      * Allows variable number of instances later
   * **Builder Pattern**  
      * **Intent**  
      The intent of Builder pattern is to separate the construction of a complex object from its representation. The same construction process can create different representations.
      * **Problem**  
    Any application using Builder pattern is required to create the elements of a complex aggregate. The aggregate's specification can exist on secondary storage but atleast one of the many representations must be built on primary storage.
      * **Benefits**  
        * Encapsulates code for construction and representation
        * The pattern provides control over the steps of construction process  

**Structural Design Patterns**  
  Let us see the details about Adapter pattern and Proxy pattern  
  * **Adapter Pattern**  
    * **Intent**  
    The intent of Adapter pattern is to convert the interface of a class into another interface that the clients expect. Adapter allows classes to work together overcoming the incompatibility. It wraps an existing class with a new interface.  
     * **Problem**  
     An application can use an adapter pattern when the wrapper must respect a particular interface and must support polymorphic behavior.  
     * **Benefits**  
        * It helps achieve flexibility and reusability
        * The client class is not complicated and can use polymorphism to swap between different implementations of adapters  
  * **Proxy Pattern**  
    * **Intent**  
    The intent of Proxy pattern is to provide a surrogate or placeholder for another object to control access to it; It uses an extra level of indirection to support intelligent, controlled and distributed access to objects; The proxy pattern adds a wrapper and delegation to protect the real component.  
    * **Problem**  
    An application that uses Proxy pattern needs to support resource-hungry objects and these objects need not be initiated unless they are requested by the client.  
    * **Benefits**  
        * Since, a virtual proxy is a placeholder, it helps eliminate the expense involved in creation of real object
        * Proxy pattern can help improve the performance of an application by caching heavy objects i.e., the frequently accessed objects  
 
**Behavioral Design Patterns**  
  Let us see the details about Strategy pattern and Visitor pattern
  * **Strategy Pattern**  
    * **Intent**  
    The intent of Strategy is to define a family of algorithms, encapsulate each one, and make them interchangeable. This pattern lets the algorithm vary independently from the clients that use it. It captures the abstraction in an interface, bury implementation details in the derived class.  
    * **Problem**  
    An application that uses Strategy pattern generally follows the "open-closed principle". That is, it encapsulates interface details in a base class, and buries the implementation details in derived class. Clients of the algorithm couple themselves to the interface.  
    * **Benefits**  
        * Strategy pattern allows an application to extend a logic in some parts of the code without the need for rewriting those parts  
        * It also allows clients to choose the required algorithm without the need of switch or if-else statements  
  * **Visitor Pattern**  
    * **Intent**  
    The intent of a visitor pattern is that it represents an operation to be performed on the elements of an object structure. The pattern lets users define a new operation without changing the classes of the elements on which it operates.  
    * **Problem**  
    There might be a lot of distinct and unrelated operations that need to be performed on objects in a heterogeneous aggregate structure. Users don't want to have to query the type of each object node and cast it to the right type before performing any operation on it.  
    * **Benefits**  
        * Visitor pattern a new operation to be defined without changing the implementation of the class  
        * A visitor object can have state  

#### Free Style  
Design patterns have been critized for being too specific and artifically limited by OO language constraints. Find and describe any pattern that may be useful in building software.

Define and describe 3 patterns that you have found.  

Let us discuss about the following 3 patterns,  
```
1. Publish-Subscribe Pattern  
2. Request-Reply Pattern  
3. Intercepting Filter Pattern  
```  
**Publish-Subscribe Pattern**  Request–response is a message exchange pattern in which a requestor sends a request message to a replier system which receives and processes the request, ultimately returning a message in response. This is a simple, but powerful messaging pattern which allows two applications to have a two-way conversation with one another over a channel.
  * **Intent**  
  In software architecture, publish–subscribe pattern is a type of messaging pattern where senders of messages, called publishers, do not program the messages to be sent directly to specific receivers, called subscribers. But instead publishers categorize published messages into classes without knowledge of which subscribers consume the messages. Similarly, subscribers can show interest in one or more classes and only receive messages that are of interest. Even the subscribers do not have any knowledge about publishers.  
  * **Problem**  
  In applications using publish-subscribe pattern, the publishers must post the messages to an intermediary message broker (event bus) and subsribers must register subscriptions with that broker. The brokers must perform a store and forward function to enroute messages from publishers to subscribers.  
  * **Benefits** 
      * Loose coupling - Publishers are loosely coupled to subscribers. This is highly advantageous as compared to the traditional client-server architecture   
      * Scalability - Provides better scalability through parallel operations and message caching  

**Request-Reply Pattern**  
  * **Intent**  
  Request–response/Request-reply is a message exchange pattern in which a requestor sends a request message to a replier system which receives and processes the request. The receiver ultimately returns a message in response. It is a simple pattern, but powerful messaging pattern which facilitates two applications to have a two-way conversation with one another over a common channel.  
  * **Problem**  
  In applications using this pattern, for simplicity, the pattern is implemented in a purely synchronous fashion, like web service calls over HTTP  
  * **Benefits**  
      * If an exception occurrs in the service then the pattern informs the client and the user can debug the problem  
      * Supports all possible bindings  
 
**Intercepting Filter Pattern**  
  * **Intent**  
  The intent of intercepting filter pattern is to intercept incoming requests and outgoing responses, allowing pre-processing and post-processing. These filters can be added or removed unobstrusively without changing existing codes.  
  * **Problem**  
  In an application that is using the intercepting filter pattern, the pattern applies reusable processing transparently before and after the actual request execution by the front and page controllers.  
  * **Benefits**  
      * Reusability - The code is centralized in pluggable components enhancing reuse  
      * Flexibility - Generic components can be applied and removed declaratively, improving flexibility  
      
### SELENIUM  

Write unit tests using Selenium that verify the following: http://checkbox.io/studies.html

* The participant count of "Frustration of Software Developers" is 55
* The total number of studies closed is 5
* If a status of a study is open, you can click on a "Participate" button
* Check if the "Software Changes Survey" has a Amazon reward image  

The unit test code can be found in [WebTest.java](https://github.ncsu.edu/nkumar8/HW2/blob/master/WebTest.java)


       
        
  

