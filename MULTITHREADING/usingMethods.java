import java.util.*;

class MyProcesses extends Process{


    public void run(){

        System.out.printf("%s IS RUNNING..." , Thread.currentThread().getName());
    }
}