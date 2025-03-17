package POLYMORPHISM;

class Shapes{
    void circle(){
        final double pi = 3.14;
        int r = 0;  
    }

    void rectangle(){
        float lenght = 0;
        float widht = 0;


    }
}

class Circle extends Shapes{
    void circle(){
        double pi = 3.14;
        int r = 2;
        double area = pi * r * r;
        System.out.printf("Area of circle : %f\n" , area);
    }
}

class Rectangle extends Shapes{
    void rectangle(){
        float lenght = 20;
        float widht = 2;

        float area = lenght * widht;

        System.out.printf("Area of rectangle : %f\n" , area);
    }
}

// main class
public class PolyIntro{
    public static void main(String[] x){
        Shapes objectCircle = new Circle();
        Shapes ObjectRectangle = new Rectangle();

        objectCircle.circle();
        ObjectRectangle.rectangle();
    }
} 