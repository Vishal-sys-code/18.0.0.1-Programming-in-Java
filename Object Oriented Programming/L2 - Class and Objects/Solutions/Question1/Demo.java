package Question1;
import java.util.*;

class Box{
    double length;
    double breadth;
    double height;

    public void setData(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double volume(){
        return (length*breadth*height);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box b1 = new Box();
        Box b2 = new Box();

        b1.setData(1, 2, 3);
        b2.setData(4, 5, 6);

        double v1,v2;
        v1 = b1.volume();
        v2 = b2.volume();

        System.out.println("Volume of first Box: " + v1);
        System.out.println("Volume of first Box: " + v2);

        if(v1 < v2){
            System.out.println("Box 2 is greater in size");
        }

        else{
            System.out.println("Box 1 is greater in size");
        }
        sc.close();
    }
}
