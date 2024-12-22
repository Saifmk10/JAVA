import java.util.*;

public class Percentage_calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float totalMarks , marksObtained , percentage;

        System.out.print("Enter the Total Marks : ");
        totalMarks = input.nextFloat();

        System.out.print("Enter the Marks Obtained : ");
        marksObtained = input.nextFloat();

        System.out.println("MARKS OBTAINED: " + marksObtained);
        System.out.println("TOTAL MARKS: " + totalMarks);

        percentage = marksObtained / totalMarks * 100;

        System.out.println("PERCENTAGE SECURED: " + percentage + " %");
    } 
}