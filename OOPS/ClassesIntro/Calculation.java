package JAVA.OOPS.ClassesIntro;
import java.util.*;
    
    class CalculationConstructor{

        private
            int NumberOne , NumberTwo;

            // constructor for the class CalculationConstructor
            CalculationConstructor(){
                System.out.println("Input accpeted");
            }

            public void GetData(int i , int j){
                NumberOne = i;
                NumberTwo = j;
            }

            public void Addition(){
                int sum = NumberOne + NumberTwo;
                System.out.printf("The sum of %d & %d is %d" , NumberOne , NumberTwo , sum); 
            }

    }

public class Calculation {
    public static void main(String[] args) {
        CalculationConstructor object = new CalculationConstructor();

        int num1 , num2;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        num1 = Input.nextInt();
        System.out.println("Enter the number 2: ");
        num2 = Input.nextInt();

        object.GetData(num1 , num2);

        object.Addition();
    }
}

