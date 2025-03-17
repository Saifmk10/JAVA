// this code covers both the concepts of abstract class and abstract functions

package POLYMORPHISM;
import java.io.BufferedReader;
import java.util.*;

// Abstract is a part of the OOPS concept that provides a blue print for the class that can be inherited by other classes ,
//  In abstract class we can add both concrete and abstract function
// An abstract class can never have an object of its own , which means that we need to make an object for the class that has inherited the abstract class    
abstract class Bank{
    abstract String accountHolder();
    abstract int accountBalance();
}

class GooglePay extends Bank{
    String accountHolder() {
        final String holderName = "Saif";
        return holderName;
    }
    
    int accountBalance() {
        int balance = 12324;
        return balance;
    }
}

class PayPal extends Bank{
    String accountHolder() {
        final String holderName = "Saifmk";
        return holderName;
    }
    
    int accountBalance() {
        int balance = 18358;
        return balance;
    }
}

public class AbstractBasic{
    public static void main(String[]  a){
        GooglePay googlePayAccountDetails = new GooglePay();
        PayPal payPalAccountDetails = new PayPal();


        System.out.println("||||    \t      /\\   ");
        System.out.println("|   \\  \t     /  \\  ");
        System.out.println("|---/   \t    /----\\ ");
        System.out.println("|   \\  \t   /      \\");   
        System.out.println("||||    \t   |      |");


        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE BANKING APPLICATION : ");
        String bankName = input.nextLine();

        if(bankName.equals("Google Pay")){
            System.out.printf("BANKING NAME : %s\n" , googlePayAccountDetails.accountHolder());
            System.out.printf("BANKING BALANCE : %d\n" , googlePayAccountDetails.accountBalance());
        }
        else if(bankName.equals("Pay Pal")){
            System.out.printf("BANKING NAME : %s\n" , payPalAccountDetails.accountHolder());
            System.out.printf("BANKING BALANCE : %d\n" , payPalAccountDetails.accountBalance());
        }
        else{
            System.out.printf("YOU DONT HOLD ANY ACCOUNT IN %s\n" , bankName);
        }
    }
}
