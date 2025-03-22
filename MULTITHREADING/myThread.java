// package JAVA.MULTITHREADING;

class MyThread extends Thread{
    // public void run(){
    //     System.out.printf("thread is running...");
    // }

    private Thread metaDetails;

    public void run(){
        metaDetails = Thread.currentThread();
    }

    public Thread gettingMetaDetails(){
        return metaDetails;
    }
}

public class myThread{
    public static void main(String[] argumStrings){
        MyThread process = new MyThread();

        process.start();

        try{
            process.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }


        
        Thread details =  process.gettingMetaDetails();

        System.out.printf("Process Name: %s", details.getName());
        System.out.printf("\nProcess Id: %d", details.getId());
        System.out.printf("\nProcess Priority: %d", details.getPriority());

    }
} 
