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

public class multilevelinheritance {
    public static void main(String[] args){
        Cub Simba = new Cub();
        Simba.eat();
        Simba.roar();
        Simba.weep();
    }  
}
