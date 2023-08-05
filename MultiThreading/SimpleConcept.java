package MultiThreading;

public class SimpleConcept {
    //main thread
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread); //Thread[main,5, main]
        System.out.println(thread.getName()); //main
        System.out.println(thread.getClass()); //class java.,lang.thread
        System.out.println(thread.getState()); //Runnable

    }
}
