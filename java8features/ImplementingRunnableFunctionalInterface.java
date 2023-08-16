package java8features;

class A implements Runnable{

    @Override
    public void run() {
        for(int i =1; i<5;i++){
            System.out.println("Run Method() A");
        }
    }
}
public class ImplementingRunnableFunctionalInterface {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
            for(int i =1; i<5;i++){
                System.out.println("Run Method() Main class");
            }
        t.start();
    }
}
