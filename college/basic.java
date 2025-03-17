package JAVA.college;

import java.util.*;
import java.io.BufferedReader;

class basicOperations{
    public float multiplication(float num1 , float num2){
        return num1 * num2;
    }

    public int addition(int num1 , int num2){
        return num1 + num2;
    }

    public float division(float num1 , float num2){
        return num1 / num2;
    }
}

public class basic{
    public static void main(String[] arguments){
        basicOperations operations = new basicOperations();

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the operation to perform: \n 1.addition\n2.multiplication\n3.division");
        int userInput = input.nextInt();

        switch (input) {
            case 1:
                
                break;
        
            default:
                break;
        }
        
    }
}