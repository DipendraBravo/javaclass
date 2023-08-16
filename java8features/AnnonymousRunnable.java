package java8features;

public class AnnonymousRunnable {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            for(int i =1; i<5;i++){
                System.out.println("Run Method()");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
    }
}
