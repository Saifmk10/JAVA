import java.util.*;

public class Getting_input_SCANNER{
    public static void main(String[] args){ 

        System.out.println("ENTER YOUR NAME:");
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        System.out.println("YOUR NAME IS :" + name);
    }
}