import java.util.*;

class MyProcesses extends Thread{


    public void run(){

        System.out.printf("%s IS RUNNING..." , Thread.currentThread().getName());

        try{
            int time = 2;
            System.out.printf("\n%S IS SLEEPING FOR %d SEC ..." , Thread.currentThread().getName() , time);
            Thread.sleep(time);
        }
        catch(InterruptedException exception){
            System.out.printf("\n%s WAS INTERUPTED ..." , Thread.currentThread().getName());
        }

        System.out.printf("\n%s EXCEPTION COMPLETED..." , Thread.currentThread().getName());
    }
}

public class usingMethods {
    public static void main(String[] argument){
        MyProcesses runTheProcess = new MyProcesses();
        runTheProcess.start();

        try{
            runTheProcess.join();
        }
        catch(InterruptedException exception){
            exception.printStackTrace();
        }
    }
}