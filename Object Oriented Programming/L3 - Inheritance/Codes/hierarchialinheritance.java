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