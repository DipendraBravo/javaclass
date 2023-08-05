package MultiThreading;

public class ReactivestreamsCount {
    public static void main(String[] args) {

        Thread thread1 = new Thread();
        thread1.start();
        System.out.println(thread1.isAlive());

        Thread thread2 = new Thread();
        thread2.start();
        System.out.println(thread2.isAlive());

        System.out.println(Thread.activeCount());
    }
}
