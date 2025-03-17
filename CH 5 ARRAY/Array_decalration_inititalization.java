// declartion and initialization of array in java using another class

import java.util.*;
import java.lang.reflect.*;

class ArrayDeclarationInititalization{
    private
    int[] Array = {10 , 20 , 30 , 40};

    public void PrintArray(){

        System.out.printf("The elements present in the array are:");

        for(int i=0; i<Array.length; i++){
            System.out.printf("%d \t" , Array[i]);
        }

        System.out.printf("\nNumber of elements present: %d\n" , Array.length);
    }

    public void ArrayHashcode(){

        for(int i=0; i<Array.length; i++){
            System.out.printf("%d \t" , Array.hashCode());
        }
        
        System.out.printf("Hashed Version : %d");
    }

    protected void finalize() throws Throwable{
        super.finalize();
    }
}


public class Array_decalration_inititalization{
    public static void main(String[] arg){
        ArrayDeclarationInititalization object = new ArrayDeclarationInititalization();
        object.PrintArray();
        object.ArrayHashcode();
    }
}