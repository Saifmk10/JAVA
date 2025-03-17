import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;


public class fileclass{
    public static void main(String[]  argument){
        File directory = new File("D:\\UNIVERSTY\\Java\\JAVA\\EFFECTIVE INPUT OUTPUT");

        File create = new File("new.txt");

        try{
            if(create.createNewFile()){
                System.out.printf("FILE HAS BEEN CREATED IN:" + create.getAbsolutePath());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException expression){
            System.out.println("An error has occured");
        }   
    }
}
