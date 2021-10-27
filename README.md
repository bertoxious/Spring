# Spring
## Inversion of Control
In contrast with traditional programming, in which our custom code makes calls to a library, IoC enables a framework(in my case Spring) to take control of the flow of a program and make calls to our custom code. To enable this, frameworks use abstractions with additional behavior built in. If we want to add our own behavior, we need to extend the classes of the framework or plugin our own classes.

We can achieve `Inversion of Control` through various mechanisms such as: `Strategy design pattern`, `Service Locator pattern`, `Factory pattern`, and `Dependency Injection (DI)`.


## Spring IoC container
In a spring framework the `ApplicationContext` Interface represents the IoC container. The spring container is responsible for instantiating, configuring and assembling objects known as `Beans` as well as managing their life cycles.

## POJO vs Beans
POJO stands for Plain Old Java Object. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring any classpath. POJOs are used for increasing the readability and re-usability of a program. POJOs have gained the most acceptance because they are easy to write and understand. They were introduced in EJB 3.0 by Sun microsystems.

#### A POJO should not:

-> Extend prespecified classes, Ex: public class GFG extends javax.servlet.http.HttpServlet { … } is not a POJO class.  
-> Implement prespecified interfaces, Ex: public class Bar implements javax.ejb.EntityBean { … } is not a POJO class.  
-> Contain prespecified annotations, Ex: @javax.persistence.Entity public class Baz { … } is not a POJO class.  

### Example of POJO Java Class
package Jtp.PojoDemo;    
public class Employee {    
private String name;    
private String id;   
private double sal;    
public String getName() {   
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getId() {  
    return id;  
}  
public void setId(String id) {  
    this.id = id;  
}  
public double getSal() {  
    return sal;  
}  
public void setSal(double sal) {  
    this.sal = sal;  
}  
}  

#### Properties of POJO class
-> The POJO class must be public.  
-> It must have a public default constructor.  
-> It may have the arguments constructor.  
-> All objects must have some public Getters and Setters to access the object values by other Java Programs.  
-> The object in the POJO Class can have any access modifies such as private, public, protected. But, all instance variables should be private for improved security of the project.  
-> A POJO class should not extend predefined classes.  
-> It should not implement prespecified interfaces.  
-> It should not have any prespecified annotation.  

#### Beans are special type of Pojos. There are some restrictions on POJO to be a bean.

-> All JavaBeans are POJOs but not all POJOs are JavaBeans.  
-> Serializable i.e. they should implement Serializable interface. Still, some POJOs who don’t implement Serializable interface are called POJOs because Serializable is a marker interface and therefore not of much burden.  
-> Fields should be private. This is to provide the complete control on fields.  
-> Fields should have getters or setters or both.  
-> A no-arg constructor should be there in a bean.  
-> Fields are accessed only by constructor or getter setters.  

POJO Class | Bean Class  
----------  | ---------
May or may not implement Serializable interface | must implement Serializable Interface  
Can be accessed by using their names | Can only be accessed using getters and setters  

Attempt | #1 | #2 | #3 | #4 | #5 | #6 | #7 | #8 | #9 | #10 | #11
--- | --- | --- | --- |--- |--- |--- |--- |--- |--- |--- |---
Seconds | 301 | 283 | 290 | 286 | 289 | 285 | 287 | 287 | 272 | 276 | 269
