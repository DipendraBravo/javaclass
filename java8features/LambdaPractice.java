package java8features;

@FunctionalInterface
interface LambdaProperties{
    void add(int a, int b);
}
public class LambdaPractice {
    public static void main(String[] args) {
        LambdaProperties lambdaProperties = (x,y)-> System.out.println("Sum of: "+(x+y));
        lambdaProperties.add(10,20);
    }

}
