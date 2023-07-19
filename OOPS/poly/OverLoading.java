package OOPS.poly;

public class OverLoading {
//    Method overloading
//    one class is enough
//    method name must be same, args can be different
    public void m1(int a){
        System.out.println("Integer: "+a);
    }

    public void m1(long l){
        System.out.println("Long is:"+l);

    }

    public void m1(double d){
        System.out.println("Double is:"+d);
    }

    public static void main(String[] args) {
        OverLoading obj = new OverLoading();
        obj.m1(10);
        obj.m1(10L);
        obj.m1(10d);
    }
}
