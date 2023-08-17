package java8features;

public class InsideThreadCallingRunnableInterface {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5;i++){
                    System.out.println("Main Thread");
                }
            }
        });
        t.start();

        Thread t2 = new Thread(()->{
            for (int i =0;i<5;i++){
                System.out.println("Lambda expression");
            }
        });
        t2.start();
    }
}
