package OOPS.Abstraction;

class AAA{
    public void m1(){
        System.out.println("M1 Method");
    }
}
abstract class BBB extends AAA{
    public void m2(){
        System.out.println("M2 Method");
    }
    public abstract void m3();
}
class CCC extends BBB{
    @Override
    public void m3() {
        System.out.println("M3 Method");
    }
}
public class Example6 {
    public static void main(String[] args) {
        CCC obj = new CCC();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
