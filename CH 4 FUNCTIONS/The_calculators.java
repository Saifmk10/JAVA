import java.util.*;
// import java.io.*;
public class The_calculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the number form the menu to calculate: \n 1. BMI \n 2. BODY FAT \n 3. CALORIES\n");
        System.out.printf("Enter the option: ");

        int option = input.nextInt();

        switch(option){
            case 1:
                System.out.printf("Your have choosen BMI CALCULATOR\n");
                BMI();
                break;
    
            case 2:
                System.out.printf("Your have choosen BODY FAT CALCULATOR\n");
                break;

            case 3:
                System.out.printf("Your have choosen CALORIES CALCULATOR\n");
                break;            

            default:
                System.out.printf("Please choose an option from the menu\n");
                break;
        }
    }


    // function to calculate the body mass index
    static void BMI(){

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter your weight in kgs :");
        float weight = input.nextFloat();   
        System.out.printf("Enter your height in meters :");
        float height = input.nextFloat();

        double heightSquared = Math.pow(height, 2);

        System.out.printf("WEIGHT : %f \n HEIGHT : %f" , weight , height);

        double bmi = weight / heightSquared;

        System.out.printf("\nYOUR BMI IS : %f\n" , bmi);


        if(bmi < 18.5){
            System.out.printf("\n YOU ARE UNDER WEIGHT...");
        }
        else if(bmi > 18.5 && bmi < 24.9){
            System.out.printf("\n YOUR WIEGHT IS PERFERCT...");
        }
        else if(bmi > 25 && bmi < 29.9){
            System.out.printf("\n YOU'VE BEEN LISTED UNDER OVERWEIGHT...");
        }
        else{
            System.out.printf("\n YOU'VE BEEN LISTED UNDER OBESE");
        }
    }

    static void BodyFat(){
        
    }
    
}
