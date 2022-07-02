import java.util.Scanner;

class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Number: " + n);
        sc.close();
    }
}