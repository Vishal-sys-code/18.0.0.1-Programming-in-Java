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


**RUNTIME PROCESS :**

```
Class File ---------> Class Loader ---------> Byte Code Verifier ---------> Interpreter ---------> Run Time ---------> Hardware
```

<p><b>Simple Syntax of Java: </b></p>

```
class Syntax{
    public static void main(String[] args){
        System.out.println("Hello!!!");
    }
}
```