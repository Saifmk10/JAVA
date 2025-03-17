import java.io.File;
import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.util.*;

class path{
    // setting a default path for the repo to work with 
    protected File repoPath = new File("D:\\UNIVERSTY\\Java\\JAVA\\EFFECTIVE INPUT OUTPUT");

    File[] filesAvailable = repoPath.listFiles(); // this is going to hold all the files available 
}
 
class repoDetails extends path{
    public void displayDetails(){
        if(repoPath.exists()){
            System.out.printf("REPOSITORY : " + repoPath.getName());

            // this for loop will display all the files that are available within the main repo
            System.out.printf("\nFILES AVAILABLE :\n");
            for(int i=0; i<filesAvailable.length; i++){
                System.out.printf("%d --> %s" , i+1 , filesAvailable[i].getName());
                System.out.printf("\n");
            } 
        }
        else{
            System.out.printf(repoPath.getName() +  "PATH DOES NOT EXIST");
        }
    }



    public void fileDetails(){
        // colors used for the terminal 
        String red = "\033[31m";
        String reset = "\033[0m";
        String green = "\033[32m";
        String blue = "\033[34m";
        String yellow = "\033[33m";
        boolean exists = false;
        
        // getting input from the user for the file selection
        System.out.printf(blue + "Enter File Name : ");
        Scanner input = new Scanner(System.in);
        String selectedFile = input.nextLine();

        File fileExistsCheck = new File(repoPath , selectedFile); //this is going to check if the file exists by providing the path and the file name as arguments

        for(int i=0; i<filesAvailable.length; i++ ){
            if(fileExistsCheck.exists()){
                File LM = new File(selectedFile); //LM here means last modified it is an object for the file class
                
                
                long lastModifiedDetails = LM.lastModified(); //variable will hold the details in a long format which needs to be converted to date format
                boolean fileReadPermission = LM.canRead();
                boolean fileWritePermission = LM.canWrite();
                boolean fileExePermission = LM.canExecute();




                // SimpleDateFormat is a build in class used to format the float value into date
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
                String formattedDetails = sdf.format(new Date(lastModifiedDetails));

                System.out.printf("*==========\tFILE DETAILS\t==========*      ");
                System.out.printf(green + "\nFILE NAME    : %s" + reset, selectedFile);
                System.out.printf(green + "\nMODIFICATION DETAILS : %s" + reset, formattedDetails);
                System.out.printf(green + "\nREAD ACCESS : %s" + reset, fileReadPermission);
                System.out.printf(green + "\nWRITE ACCESS : %s" + reset, fileWritePermission);
                System.out.printf(green + "\nEXECUTE ACCESS : %s" + reset, fileExePermission);
                return;
            } 
            else{
                System.out.printf(red +"\n%s Does not exist..." + reset , selectedFile);
                break;
            }
        }

        
        
    }
}



public class fileExplorer{
    public static void main(String[] argumStrings){
        repoDetails fileSystem = new repoDetails();
        fileSystem.displayDetails();
        fileSystem.fileDetails();
    }
}
