import java.util.*;

public class Addition_of_two_numbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.printf("Enter the two numbers to find their sum : ");
            int numberOne = input.nextInt(); 
            int numberTwo = input.nextInt();

            addition(numberOne, numberTwo);
        }

        static void addition(int a , int b){
            int sum = a + b;
            System.out.printf("The sum of %d and %d is %d" , a , b, sum);
        }
}
