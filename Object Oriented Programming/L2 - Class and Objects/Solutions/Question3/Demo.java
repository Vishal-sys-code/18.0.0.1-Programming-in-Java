package Question3;

class Box{
    double length;
    double breadth;
    double height;

    // No Argument Constructor
    Box(){
        System.out.println("No-Argument Constructor");
    }

    //Parameteried Constructor
    Box(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    /*
    Box(int i){
        this.i = i;
    }
    */

    public double TotalSurfaceArea(double length, double breadth, double height){
        return ((2*length*breadth) + (2*breadth*height) + (2*height*length));
    }

    public double volume(double length, double breadth, double height){
        return (length*breadth*height);
    }

    public double volume(double l){
        return (l*l*l);
    }

    public void display(double length, double breadth, double height){
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
        System.out.println("Total Surface Area: " + TotalSurfaceArea(length, breadth, height));
        System.out.println("Volume of Box " + volume(length, breadth, height));
        System.out.println("Volume of One Parameter: " + volume(length));
    }
}

public class Demo {
    public static void main(String[] args) {
        Box b = new Box();
        b.display(1, 2, 3);
        b.TotalSurfaceArea(1, 2, 3);
        b.volume(1,2,3);
        b.volume(1);
    }
}
