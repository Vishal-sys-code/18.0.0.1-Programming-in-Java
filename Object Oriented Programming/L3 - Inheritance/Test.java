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