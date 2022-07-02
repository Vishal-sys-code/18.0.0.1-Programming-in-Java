# INTRODUCTION TO JAVA

Java was invented by James Gosling in SunMicrosystems and later it is been taken over by Oracle. 
<br>

Java is a object oriented programming language.
It is not a purely OOP language because it contains primitive datatypes such as: int, char, boolean etc.

<br>

**Java Platforms :**

* Java Standard Edition
* Java Enterprice Edition
* Java Micro Edition
* Java FX

## JVM (Java Virtual Machine)

Java Virtual Machine is an abstract machine. it is also called a virtual machine because it actually doesn't exist physically. <br>
It is a specification that provides the runtime environment in which java bytecode is being executed. <br>

_It performs :_

* Load Code
* Execute Code
* Verifies Code
* Provides an Runtime environment

## JRE (Java RunTime Environment)
It is a set of software tools which are used to develop java applications.<br>
It provides an runtime environment, it is the implementation of JVM.

## JDK (Java Development Kit)
It is a software development environment which is used to develop java application and applets. It physically exist.
<br>
**_JRE + JVM = JDK_**

## **Features of Java**

* Object Oriented
* Secured
* Simple
* Platform Independent
* Robust
* High Performance
* Dynamic
* Portable
* Distributed

```
               (Compiled) 
 Source Code --------------> Byte Code 
   (Interpreted)
 -----------------> Machine Code
```

### Java doesn't Supports: 

* go-to statements
* operator overlaoding
* structures and unions
* call by reference
* pointers

_Java is not interacted with the hardware._ 


<p><b>Simple Syntax of Java: </b></p>

```
class Syntax{
    public static void main(String[] args){
        System.out.println("Hello!!!");
    }
}
```

**Every meaning in the syntax:**

```class: ```It is used to declare a class in Java. <br>

```public: ``` It is an access modifier that represents visibility.<br>

```void: ``` It is the return type of the method. It doesn't return any value.

```main: ``` It represents the starting point of the program.

```static: ``` If we declare any method as static it is known as the static keyword. <br>The core advantage of the static method is that there is no need to create an object to invoke the static method.
<br> The main() method is executed in JVM so it doesn't need to creating the object and invoke in the main() method. So it saves the memory.

<br>


**RUNTIME PROCESS :**

```
Class File ---------> Class Loader ---------> Byte Code Verifier ---------> Interpreter ---------> Run Time ---------> Hardware
```
<br>

```ClassLoader: ```It is the subsystem of JVM that is used to load class files.

```ByteCode Verifier: ``` Checks the code fragment for illegal code that can violate access right to objects.

```Interpreter: ``` Read the bytecode stream then execute the instructions.

<br>

**JVM Architecture**

![Archtecture](/Java%20Basics/Introduction%20to%20Java/images/Architecture.png)

<br>
<hr>