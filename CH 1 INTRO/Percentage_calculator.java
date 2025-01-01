import java.util.*;

public class Percentage_calculator{
    public static void main(String[] args){

        // The scanner used bellow is a class that helps the users to get the input from the user from the terminal / output in the JAVA
        // The 'input' can be said to be the object of the class
        Scanner input = new Scanner(System.in);
        float totalMarks , marksObtained , percentage;

        System.out.print("Enter the Total Marks : ");
        totalMarks = input.nextFloat(); // in this line we are using 'input.' this is used to 

        System.out.print("Enter the Marks Obtained : ");
        marksObtained = input.nextFloat();

        System.out.println("MARKS OBTAINED: " + marksObtained);
        System.out.println("TOTAL MARKS: " + totalMarks);

        percentage = marksObtained / totalMarks * 100;

        System.out.println("PERCENTAGE SECURED: " + percentage + " %");
    } 
} 