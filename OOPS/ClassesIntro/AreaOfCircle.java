package JAVA.OOPS.ClassesIntro;
import java.util.*;
class Circle{
    float radius;
    double pi = 3.17;


    public void AreaCalculation(){
        System.out.println("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextFloat();

        double areaOfCircle = pi * radius * radius;

        System.out.printf("Area of circle = %f" , areaOfCircle);
    }
}

public class AreaOfCircle {
    public static void main(String[]  arg){
        System.out.printf("AREA OF CIRCLE CALCULATION\n");

        Circle c1 , c2;

        c1 = new Circle();
        c2 = new Circle();

        c1.AreaCalculation();
        c2.AreaCalculation();
    }
}
