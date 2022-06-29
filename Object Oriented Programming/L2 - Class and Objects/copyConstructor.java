class A{
    int a; 
    String s;
    A(){
        a = 10;
        s = "ecernwala";
        System.out.println(a + " " + s);
    }
    A(A ref){
        a = ref.a;
        s = ref.s;
        System.out.println(a + " " + s);
    }
    public void display(){
        System.out.println("Copy Constructor");
    }
}

class copyConstructor {
    public static void main(String[] args){
        A r = new A();
        A r2 = new A(r);
        r2.display();
    }
}