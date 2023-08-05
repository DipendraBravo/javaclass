package MultiThreading;

public class ThreadJoinPractice extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinPractice threadJoinPractice1 = new ThreadJoinPractice();
        ThreadJoinPractice threadJoinPractice2 = new ThreadJoinPractice();
        ThreadJoinPractice threadJoinPractice3 = new ThreadJoinPractice();

        threadJoinPractice1.start();
        Thread.currentThread().getName();
        threadJoinPractice1.join();


        threadJoinPractice2.start();
        Thread.currentThread().getName();
        threadJoinPractice2.join();

        threadJoinPractice3.start();
        Thread.currentThread().getName();
        threadJoinPractice3.join();

    }
}
