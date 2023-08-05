package MultiThreading;

public class ImplementinRunnable implements Runnable{
    public static void main(String[] args) {
        ImplementinRunnable implementinRunnable = new ImplementinRunnable();
        Thread t1 = new Thread(implementinRunnable);
        t1.start();

        Thread t2 = new Thread(implementinRunnable);
        t2.start();

    }

    @Override
    public void run() {
        System.out.println("Run method");
    }
}
