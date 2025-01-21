import java.util.*;

public class Addition_of_two_numbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.printf("Enter the two numbers to find their sum : ");
            int numberOne = input.nextInt(); 
            int numberTwo = input.nextInt();

            int total = addition(numberOne, numberTwo);

            System.out.printf("The sum is : %d" , total);
        }

        static int addition(int a , int b){
            int sum = a + b;
            return (sum);
        }
}
