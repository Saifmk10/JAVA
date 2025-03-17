package INHERITANCE;

class Vehicles{

    public String name = "Hyundai";
    public Double speed = 150.2;
    public int seats = 6;



    public void printDetails(){
        System.out.printf("BRAND : %s \n" , name);
        System.out.printf("SPEED : %f \n", speed);
    }
}

class VehiclesSpecification extends Vehicles{
    public void seatingDetails(){
        System.out.printf("SEATS %d\n" , super.seats);
    }   
}

public class basic_inheritance{
    public static void main(String[] args) {
        VehiclesSpecification IMadeobject;
        IMadeobject = new VehiclesSpecification();
        IMadeobject.printDetails();
        IMadeobject.seatingDetails();
    }
}