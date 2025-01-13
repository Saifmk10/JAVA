import java.util.*;

public class loops{
    public static void main(String[]  arg){

        Scanner input = new Scanner(System.in);
        String userRequiredLoop;
        int iterations;

        System.out.println("Enter the loop required:");
        userRequiredLoop = input.nextLine();
        
        
        switch (userRequiredLoop.toLowerCase()) {
            case "while loop":
                System.out.println("WHILE LOOP SELECTED...");
                System.out.println("Enter the number of iterations :");
                iterations = input.nextInt();

                while(iterations>0){
                    System.out.println("CONGRATS ON LEARNING WHILE LOOP");
                    iterations--; // keeps decrementing the iteration value which will elemenate the infinite loop execution
                }
                break;

            case "for loop":
                System.out.println("FOR LOOP SELECTED...");
                System.out.println("Enter the number of iterations :");
                iterations = input.nextInt();

                for(int i=0; i<iterations; i++){ //the conditions are controlled by the
                    System.out.println("CONGRATS ON LEARNING FOR LOOP");
                }
            break;
        
            default:
                break;
        }
    }
}