package Question2;
import java.util.*;

class Bank_Account{
    String Account_Holder_Name;
    int Account_Number;
    double balance;
    String Account_Type;

    public void setData(String Account_Holder_Name, int Account_Number, double balance, String Account_Type){
        this.Account_Holder_Name = Account_Holder_Name;
        this.Account_Number = Account_Number;
        this.balance = balance;
        this.Account_Type = Account_Type;
    }

    public void withdraw_money(double m){
        balance -= m;
        System.out.println("Balance: " + balance);
        System.out.println(" ");
    }

    public void deposit_money(double n){
        balance += n;
        System.out.println("Balance: " + balance);
        System.out.println(" ");
    }

    public void displayData(){
        System.out.println("Name: " + Account_Holder_Name);
        System.out.println("Account Number: " + Account_Number);
        System.out.println("Account Type: " + Account_Type);
        System.out.println("Balance: " + balance);
        System.out.println(" ");
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank_Account a = new Bank_Account();
        Bank_Account b = new Bank_Account();

        a.setData("Vishal Pandey", 123456789 , 500000, "Savings");
        b.setData("Ishanvi Pandey", 234567891, 600000, "Current");

        a.deposit_money(100000);
        b.withdraw_money(100000);

        a.displayData();
        b.displayData();

        sc.close();
    }    
}
