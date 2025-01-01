// The Authonticator is a application that is used to make sure that the authorized person gets the particular link
// This application is build using JAVA and will cover the concept of DECISION CONTROL

import java.util.*;

public class Authonticator{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        // the credentials are saved in the varibales as this is a simple one person program and the concept of array has not been covered yet.
        // in case of large data the usage of an array would be more practical as it is easily scalebale.
        String userName = "Saifmk";
        String password = "SaifsJava";
        String enteredUserName , enteredPassword;

        System.out.println("WELCOME TO AUTHONTICATOR");
        System.out.print("ENTER YOUR USERNAME : ");
        enteredUserName = input.nextLine();
        // System.out.println(enteredUserName);

        if(!enteredUserName.equals(userName)){
            System.out.println("Opps... Seems like your not an user :(");
        }
        else{
            System.out.println("Welcome back " + userName);
            System.out.print("ENTER YOUR PASSWORD : ");
            enteredPassword = input.nextLine();


            if(!enteredPassword.equals(password)){
                System.out.println("-_- Incorrect Password -_-");
            }
            else{
                System.out.println("LINK : " + "https://youtu.be/NozjRGJW22o");
            }
        }
    }
}