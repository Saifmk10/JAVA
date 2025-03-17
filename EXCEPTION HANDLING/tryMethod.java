// int this code of exeption handling we have used try catch and finally to run excpetion handling of a wrong input by the user.


import java.util.*;
import java.io.BufferedReader;

abstract class iAmTrying{
    abstract int addition(int a , int b);
    abstract float multiplication(int a , int b);
}

class Calculation extends iAmTrying{
    int addition(int a , int b){
        int sum = a + b; 
        return sum;
    }

    float multiplication(int a , int b){
        float product = a * b;
        return product;
    }
}

public class tryMethod{
    public static void main(String[] arguments){
        Scanner input = new Scanner(System.in); //object decalration for the scanner class to get input

    try{ // the try method runs the code bellow normally and if there is any error occured in the try then it will be caught by the catch functions argument
        Calculation cal = new Calculation();
        
        
        System.out.printf("ENTER THE OPERATION TO BE PERFORMED: ");
        int userInput = input.nextInt(); 
        

        switch (userInput){
            case 1:
                System.out.printf("ENTER TWO NUMBERS TO ADD : ");
                System.out.printf("NUMBER 1 : ");
                int numberOne = input.nextInt();
                System.out.printf("NUMBER 2 : ");
                int numberTwo = input.nextInt();

                int sumResult = cal.addition(numberOne, numberTwo);

                System.out.printf("THE SUM OF %d + %d = %d" , numberOne ,numberTwo , sumResult);
                break;

            case 2:
                System.out.printf("ENTER TWO NUMBERS TO ADD : ");
                System.out.printf("NUMBER 1 : ");
                int numOne = input.nextInt();
                System.out.printf("NUMBER 2 : ");
                int numTwo = input.nextInt();

                float productResult = cal.addition(numOne, numTwo);

                System.out.printf("THE SUM OF %f + %f = %f" , numOne ,numTwo , productResult);
                
                break;
        
            default:
                break;
        }
    
    } 
    catch(InputMismatchException expression){
        System.out.printf("YOU HAVE ENTERED AN ALPAHBET");
    }
    finally{
        input.close();
    }
    }
}