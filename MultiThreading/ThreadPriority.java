package MultiThreading;

public class ThreadPriority extends Thread{
    public static void main(String[] args) {
        ThreadPriority threadPriority1 = new ThreadPriority();
        ThreadPriority threadPriority2 = new ThreadPriority();
        ThreadPriority threadPriority3 = new ThreadPriority();

        System.out.println(threadPriority1.getPriority());
        System.out.println(threadPriority2.getPriority());
        System.out.println(threadPriority3.getPriority());

        threadPriority1.setPriority(7);
        threadPriority2.setPriority(8);
        threadPriority3.setPriority(9);
        //set priortity to 10 only

        System.out.println(threadPriority1.getPriority());
        System.out.println(threadPriority2.getPriority());
        System.out.println(threadPriority3.getPriority());
        System.out.println("");

        threadPriority1.setPriority(MAX_PRIORITY);
        threadPriority2.setPriority(MIN_PRIORITY);
        threadPriority3.setPriority(NORM_PRIORITY);

        System.out.println(threadPriority1.getPriority());
        System.out.println(threadPriority2.getPriority());
        System.out.println(threadPriority3.getPriority());



    }

}
