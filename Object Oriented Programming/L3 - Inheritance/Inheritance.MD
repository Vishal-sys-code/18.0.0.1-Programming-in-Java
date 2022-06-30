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

**On the basis of classification Java supports only 3 inheritances Single, Multi-level, Hierarchial and the other two Multiple and Hybrid is been supported by interface only.**

## Single Inheritance

When a class inherits another class is called Single Inheritance.

```
class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
}

class Test{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
```

```Output:``` <br>
Eating <br>
Barking

## Multi-level Inheritance

When there is a chain of Inheritance is called Multi-level Inheritance.

```
class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}

class Lion extends Animal{
    public void roar(){
        System.out.println("Roaring");
    }
}

class Cub extends Lion{
    public void weep(){
        System.out.println("Weeping");
    }
}

class multilevelinheritance{
    public static void main(String[] args){
        Cub Simba = new Cub();
        Simba.eat();
        Simba.roar();
        Simba.weep();
    }
}
```

```Output:``` <br>
Eating<br>
Roaring<br>
Weeping<br>

## Hierarchial Inheritance

When two or more classes inherits a single class is called Hierarchial Inheritance.

```
class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking");
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("Meowing");
    }
}

class hierarchialinheritance{
    public static void main(String[] args){
        Cat yu = new Cat();
        yu.eat();
        yu.meow();
        //yu.bark(); // Compile Time Error
    }
}
```