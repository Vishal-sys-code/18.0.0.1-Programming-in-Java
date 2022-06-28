# Classes and Objects

Suppose, you teacher had said to make a data structures to store the roll number of the students which are in your class 

Your Code should be: 
```
int[] RollNo = new int[5];
```

If your teacher said to make a data structure to store the names of the students in your class

Your code should be :

```
String[] Names = new String[5];
```

Again, 
If your teacher said to make a data structure to store the marks of the students in your class.

Your code should be :

```
double[] marks = new double[5];
```

Upto this is what we generally do If the teacher say to make a data structure that store all the names, roll numbers, marks.

Your general code should be: 
```
int[] RollNo = new int[5];
String[] Names = new String[5];
double[] marks = new double[5];
```

What if there would be a restriction for that we need a data structure like all these in a single line. <br>
Eg : 

```
Data_Structure Variable_Name = new Data_Structure[No_Of_Elements];
```

Here comes the concept of class which store all the data type in one and make the data structure in one-lined such as given above.

Creating our own data structure is how we make a class.


Syntax of Class: 
```
access_modifier Class ClassName{
    //data-types
}
```

**_By default access modifier of class is default._**

Real Life Example of Class :

Car : Engine, Seat, Price <br>
Car-Comapnies:  Hyundai, Tesla, Tata, Audi

Car isn't physically available. <br>
Car-Companies are physically available.

So, the things which are physically available are called as the **Objects** and which are not physically available are called **Class**.
<br>

Simply,<br>
Class: Logical Construct<br>
Objects: Physical Reality.

Class: Rule <br>
Objects: Follow Rule.

Objects occupies space but Class do not.

**Class**
-
- Class is a named group of properties and functions.
- Class is a collection of objects.
- Class is not a real world entity.
- Class is just a template.
- Class doesn't occupy memory.


**Objects**
- 
- Objects is an instance of class.
- Objects is a real world entity.
- Objects occupies memory.

**_Object consists of:_**
 - State/Attribute
 - Identity name
 - Behaviour

 <br>

 **State :** It's value from it's datatype <br>
 **Identity :** Whether one object is different than other<br>
 **Behaviour :** Effect of datatype operations<br>

<br>

 Suppose we have an object of Dog and class of Animals then : 

| Identity  | State/Attribute | Behaviour     |
| --------- |  ------------   | ------------- |
| Name of Dog | Breed, Age, Color     |    Eat, Run, Bark           |


- Animal is a Class. <br>
- If the animal is doing something it is it's Method. <br>
- Animal names and categoried are Objects. <br>

<br>

_Objects have an process :_

- **Declaration**
- **Instantiation**
- **Initialization**

<br>

**Declaration :**

Eg: Animal Buzo; 

_Here "Animal" is a class name and "Buzo" is a 'reference variable name'_.

Note: When we declare an object then the memory assigned to it is NULL.

<br>

**Instantiation :**

This is when the dynamic memory is allocated to the objects by the "new" keyword.<br>
*Note:* _A reference to the object that was created is returned from the new keyword._

<br>

```
new keyword is used to dynamically allocates memory at runtime and returns a reference to it.
```

**Initialization :**

This "new" keyword is followed by a call to a constructor.

```
Buzo = new Animal();
```

<br>

**How to access the instance variables?**

_By dot(.) operator_

<br>

Some Memory Related Points
-

* All the Class and Objects must allocated dynamically in Java.

-
    ```
    Student student1 = new Student();

    Here, Student student1 is the Compile-Time.
    and new Student() is the Run-Time.

    ```
* 
![Memory](/Object%20Oriented%20Programming/L2%20-%20Class%20and%20Objects/images/co1.jpg)

<br>


Note: **When we create an object a class it is being instantiated**

<hr>

Suppose we have 1000 students then we will make like this each one of the, it will take more space and consume more time to run and even compile it will be hectic to do. So we will initialise then when the object is made we say them as a **constructor**.
<br>

<hr>
<br>

# Constructor
-
* Constructor is a block similar to method having same name as that of class. <br>
* Constructor doesn't have any return type not even void.
* The only modifiers are applicable is public, protected, private, default.

**Why does there is no return type of the constructor?**
```
Whenever, we are creating an object constructor will be executed automatically. So return type concept is not applicable in constructor.
```

Note: _It is legal to have a method name as same as the class name but it is the studpid practice._

Only applicable access modifiers are :<br>
**private:** create object only in the same class<br>
**protected:** create object only in the same package<br>
**public:** anywhere we can create object<br>
**default:** only same package we can create object.<br>

**Singleton Classes:** to improve performance. For any java class used to create only one object.<br>
Eg: Runtime class, Datetime class.

## Types of Constructor
- Default Constructor
- No Argument Constructor
- Parameterized Constructor

### Default Constructor
This is the type of constructor which is being created by the compiler.

Note: _In the code when there is no constructor in the class then the compiler will creates it own constructor which we can't see it is called default constructor._

Eg: 
```
class Test(){


}

Compiler will say yes here is a constructor which we can't see but the compiler can see this type of constructor is said to be as the default constructor.
```
**Note :** _Every class including abstract class it contain default constructor._


### No Argument Constructor
This type of constructor is being created by the user as the default but it doesn't contain any parameter.

Eg:

```
class Test{
    Test(){
        // no-arg constructor
    }
    public static void main(String[] args){
        Test t = new test();
    }
}
```

**Note :** _Every default constructor is no-arg constructor but evert no-arg constructor is not default constructor._


### Parameterized Constructor

This is also the user-defined but it contains the parameters and arguments.

```
class Test(){
    Test(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Test t = new Test("Vishal");
    }
}
```

**Note:** <br>
* Default constructor contains only one line ```super();```<br>

Some Danger Cases in Constructor
-

*
 ![images](/Object%20Oriented%20Programming/L2%20-%20Class%20and%20Objects/images/dc1.jpg)

 **Compiler Error :** Call to super must be in first statement in constructor.

*
 ![images](/Object%20Oriented%20Programming/L2%20-%20Class%20and%20Objects/images/dc2.jpg)

 **Compiler Error :** Call to super must be in first statement in constructor.

*

![images](/Object%20Oriented%20Programming/L2%20-%20Class%20and%20Objects/images/dc3.jpg)

**Compiler Error :** Call to super must be in first statement in constructor.

```super()``` : calling another constructor from another class. <br>
```this()```: calling current class constructor.


### Constructor Overloading 
<br>

Eg:

```
class Enquiry{

    Enquiry(String name, String phone_number, String email_id, String Course){
        //statements
    }

    Enquiry(String name, String phone_number, String Course){
        //statements
    }

    Enquiry(String name, String Course){
        //statements
    }
}
```

- Constructor names are same but the arguments are different.
- We can make number or multiples of the constructor inside the same class.