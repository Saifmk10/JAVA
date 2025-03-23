import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class readingFromOs{
    public static void main(String[] arguments){

        try{
            // this will act as a bash 
            ProcessBuilder fromCmd = new ProcessBuilder("cmd.exe" , "/c" , "tasklist");
            Process StartingProcess = fromCmd.start();

            BufferedReader readingFromCmd = new BufferedReader(new InputStreamReader(StartingProcess.getInputStream()));

            String printProcess;

            while( (printProcess = readingFromCmd.readLine()) != null){
                System.out.printf("\n%s" , printProcess);
            }

            
        }
        catch(IOException exception){
            exception.printStackTrace();
        }
        

    } 
}
