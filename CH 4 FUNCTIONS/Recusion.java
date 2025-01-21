public class Recusion {
    public static void main(String[] arg){
        System.out.printf("Bellow is the result of recursive function :\n");

        RecusiveFunction();
    }

    static void RecusiveFunction(){
        System.out.printf("This is a recursive function");

        RecusiveFunction();
    }
}
