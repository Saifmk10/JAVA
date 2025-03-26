import java.util.*;
import java.io.*;

class MyTasks{
    public int sum(){
        int a = 10; 
        int b = 20; 

        System.out.printf("\nExecuted sum() in : %d's" , System.nanoTime());

        return a+b;
    }

    public int diff(){
        int a = 90; 
        int b = 20; 

        System.out.printf("\nExecuted diff() in : %d's" , System.currentTimeMillis());

        return a-b;
    }
}

class MyTasksRunning extends Thread{
    private MyTasks myTasks = new MyTasks(); 
    
    public synchronized  void run(){
        
        int total = myTasks.sum();
        System.out.printf("\n%d is the ToTaL" , total);

        try{
            Thread.sleep(1000);
        }   
        catch(InterruptedException e){
            e.printStackTrace();
        }

        int differ = myTasks.diff();
        System.out.printf("\n%d is the DiFfErAnCe" , differ);

    }

}


public class MultiTasking{
    public static void main(String[] argument){
        MyTasksRunning tasks = new MyTasksRunning();

        tasks.start();

        try{
            tasks.join();
        }
        catch(InterruptedException exception){
            exception.printStackTrace();
        }
    }
}