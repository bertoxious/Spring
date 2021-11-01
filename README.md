# Spring
## Inversion of Control
In contrast with traditional programming, in which our custom code makes calls to a library, IoC enables a framework(in my case Spring) to take control of the flow of a program and make calls to our custom code. To enable this, frameworks use abstractions with additional behavior built in. If we want to add our own behavior, we need to extend the classes of the framework or plugin our own classes.

We can achieve `Inversion of Control` through various mechanisms such as: `Strategy design pattern`, `Service Locator pattern`, `Factory pattern`, and `Dependency Injection (DI)`.

## BeanFactory vs Application Context  
`BeanFactory` loads beans on-demand, while `ApplicationContext` loads all beans at startup. Thus, `BeanFactory` is lightweight as compared to `ApplicationContext`. Let's understand it with an example.  
Properties | Bean Factory | Application Context  
--- | -------- | --------  
Annotation Support | No | Yes  
BeanPostProcessorRegistration | Manual | Automatic  
Implementation | XMLBeanFactory | ClassPath/FileSystem/WebXMLApplicationContext  
Internationalization | No | Yes  
Enterprise Services | No | Yes  
ApplicationEvent Publication | No | Yes  


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
In Pojo, there are no special restrictions other than Java conventions. | It is a special type of POJO files, which have some special restrictions other than Java conventions.  
May or may not implement Serializable interface | must implement Serializable Interface  
Can be accessed by using their names | Can only be accessed using getters and setters  
Fields may have any of the access modifiers such as public, private, protected. | Fields can only have private access.  
In POJO, it is not necessary to have a no-arg constructor; it may or may not have it. | It must have a noArgs constructor.  
In POJO, it is not necessary to have a no-arg constructor; it may or may not have it. | The disadvantage of using the Bean is that the Default constructor and public setter can change the object state when it should be immutable.  

`Bean Factory` does not support annotation based Dependency Injection whereas `Application Context` does support annotation based Dependency Injection.  

### Application Context Interface
One of the main features of the Spring framework is the IoC (Inversion of Control) container. The Spring IoC container is responsible for managing the objects of an application.   It uses dependency injection to achieve inversion of control.  
The interfaces BeanFactory and ApplicationContext represent the Spring IoC container. Here, BeanFactory is the root interface for accessing the Spring container. It provides basic functionalities for managing beans.  
On the other hand, the ApplicationContext is a sub-interface of the BeanFactory. Therefore, it offers all the functionalities of BeanFactory.  
