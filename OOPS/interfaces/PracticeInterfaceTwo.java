package OOPS.interfaces;

interface AA{
    int a= 10;
    public static final int b =20;
    int c =20;
}
public class PracticeInterfaceTwo implements AA{
    public static void main(String[] args) {
        System.out.println(PracticeInterfaceTwo.a);
        System.out.println(PracticeInterfaceTwo.b);
        System.out.println(PracticeInterfaceTwo.c);

    }

}
