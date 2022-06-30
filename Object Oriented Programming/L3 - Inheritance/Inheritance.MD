# INHERITANCE

Inheritance is a procedure in which a object acquires all the properties and behaviours of a parent object.

<br>

_Inheritance is a propety of inheriting all the properties and the behaviour from the parent class into child class._

<br>

**Terms used in Inheritance :**

 * *Class*: It is template from which object is created.
 * *Sub-Class* : Child Class.
 * *Super-Class* : Parent Class.
 * *Code resuability* : It is a mechanism that faciliates to reuse the methods and fields of the existing class when the new class is created.

<br>

**NOTE :**

* Inheritance is being achieved by **extends** keyword.
* Some of the properties cannot be inherited.

**Importance of Inheritance :**

* Code Resuability.
* We can achieve polymorphism by inheritance.

**Disadvantages :**

* Every code is been tightly coupled if we change in the parent class then the whole code will be effected.

**Syntax :**

```
class Animal{
    void eat(){
        System.out.println("I am eating");
    }
}

class Dog extends Animal{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
    }
}
```

```Output: ``` I am eating

Here Dog ```IS-A``` relationship with Animal.

**Types of Inheritance :**

* Single Inheritance.
* Multi-level Inheritance.
* Hybrid Inheritance.
* Multiple Inheritance.
* Hierarchial Inheritance.

## Single Inheritance

