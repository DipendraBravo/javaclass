package MultiThreading;

public class WaysToCreateThreadExtendingThread extends Thread{
    //ways to create thread class
    //firstway extending thread class
    public static void main(String[] args) {
        WaysToCreateThreadExtendingThread waysToCreateThreadExtendingThread = new WaysToCreateThreadExtendingThread();
        waysToCreateThreadExtendingThread.start();

    }
    public void run(){
        System.out.println("Run method");

    }
}
