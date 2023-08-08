package MultiThreading.innerthreadpractice;

class A implements Runnable{


    @Override
    public void run() {
        System.out.println(" Run Method of class A");

        synchronized (this){
            System.out.println(" synchronized block of class A");

            for (int i =0; i<5;i++){
                System.out.println(i+" loop inside synchronized block of class A");
            }
            notify();
        }
    }
}
public class WaitMethodPractice {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        System.out.println("object reference "+ a);

        Thread t = new Thread(a);
        t.start();

        synchronized (a){
            System.out.println(" synchronized block of class B");
            a.wait();
            for (int i =0; i<5;i++){
                System.out.println(i+" loop inside synchronized block of class B");
            }
        }
    }
}
