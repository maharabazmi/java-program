public class interfaceee {
    /*
    //  An interface is a class-like construct that contains only constants and abstract methods.
  //You can use an interface more or less the same way
           // you use an abstract class. For example, you can use an interface as a data type for a reference
   // variable, as the result of casting, and so on. As with an abstract class, you cannot create an
   // instance from an interface using the new operator
    /*
    the classes Chicken and Fruit in Listing 13.7 (lines 20, 39) implement
the Edible interface. The relationship between the class and the interface is known
as interface inheritance. Since interface inheritance and class inheritance are essentially the
same, we will simply refer to both as inheritance
     */
    /*
    Abstract Classes:

    An abstract class is a class that cannot be instantiated on its own. It serves as a blueprint for other classes.
    It can contain abstract methods (methods without a body) that must be implemented by any subclass, and also concrete methods (methods with a body).

Abstract Methods:

    An abstract method is a method declared without an implementation (no method body).
    It is meant to be overridden by subclasses that provide the actual implementation.
    Any class that contains one or more abstract methods must itself be declared abstract.

Interfaces:

    An interface is another way to achieve abstraction in Java.
    It can contain abstract methods (which are public and abstract by default) and static final variables.
    From Java 8 onwards, interfaces can also contain default and static methods with an implementation.

Usage of Abstraction:

    Abstraction is used to handle complexity by providing a simplified model of the real-world scenario.
    It is employed to reduce code duplication, enhance code maintainability, and create a flexible architecture.
     */
    /*
    #interface#
   In Java, an interface is a reference type that is similar to a class but only contains abstract methods, default methods, static methods, and final variables (constants).
    Interfaces provide a way to achieve abstraction and multiple inheritance in Java, as a class can implement multiple interfaces.
     */
    /*
    Abstract Methods: All methods in an interface are abstract by default (unless they are explicitly declared as default or static). This means they do not have a body and must be implemented by the classes that implement the interface.

Default Methods: Introduced in Java 8, these methods have a body and provide a default implementation. They are declared using the default keyword.

Static Methods: Also introduced in Java 8, static methods in an interface can be called independently of any object and are associated with the interface itself, not with an instance of a class that implements the interface.

Constants: All fields in an interface are implicitly public, static, and final. They must be initialized at the time of declaration.

Implementation: A class implements an interface using the implements keyword and must provide implementations for all abstract methods declared in the interface.
     */
    /*
  Edible is a supertype for Chicken and Fruit. Animal is a supertype for
Chicken and Tiger. Fruit is a supertype for Orange and Apple.
The Fruit class implements Edible. Since it does not implement the howToEat method,
Fruit must be denoted as abstract (line 39). The concrete subclasses of Fruit must
implement the howToEat method. The Apple and Orange classes implement the howToEat
method (lines 45, 52).
The main method creates an array with three objects for Tiger, Chicken, and Apple
(line 3), and invokes the howToEat method if the element is edible (line 6) and the sound
method if the element is an animal (line 9).
In essence, the Edible interface defines common behavior for edible objects. All edible
objects have the howToEat method.

     */
    //comparable interface
    /*
    The Comparable interface defines the compareTo method for comparing objects
    System.out.println(new Integer(3).compareTo(new Integer(5)));
2 System.out.println("ABC".compareTo("ABE"));
3 java.util.Date date1 = new java.util.Date(2013, 1, 1);
4 java.util.Date date2 = new java.util.Date(2012, 1, 1);
5 System.out.println(date1.compareTo(date2));
displays
-1
-2
1
public class Integer extends Number
implements Comparable<Integer> {
// class body omitted
@Override
public int compareTo(Integer o) {
// Implementation omitted
}
}
     */
    // a very good Question??//
    /*
   #So, the question arises why use interfaces when we have abstract classes?

The reason is, abstract classes may contain non-final variables,
 whereas variables in the interface are final, public, and static.
     */
    // extends policy
 /* Relationship Between Class and Interface

    A class can extend another class similar to this an interface can extend another interface. But only a class can extend to another interface, and vice-versa is not allowed.
    Relationship between Class and Interface


    In an interface, you must initialize variables as they are final but you can’t create an object.
    In Interface only one specifier is used- Public.

    // Java program to demonstrate working of
// interface

import java.io.*;

// A simple interface
interface In1 {

    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface.
class TestClass implements In1 {

    // Implementing the capabilities of
    // interface.
    public void display(){
      System.out.println("Geek");
    }

    // Driver Code
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}
extends#
One interface can inherit another by the use of keyword extends.
 When a class implements an interface that inherits another interface,
 it must provide an implementation for all methods required by the interface inheritance chain.

     */
}
