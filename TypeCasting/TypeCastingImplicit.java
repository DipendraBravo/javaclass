package TypeCasting;

public class TypeCastingImplicit {
    public static void main(String[] args) {
        //Implicit Casting From lower to higher
        //Byte - short -int- float- long-double

        byte b1 = 10;
        short s1 = b1;
        System.out.println(s1);

        int il = s1;
        System.out.println(il);

        long l1 = il;
        System.out.println(l1);

        float f1 = l1;
        System.out.println(f1);

        double d1 = f1;
        System.out.println(d1);

        char ch = 'A';

        int ill =ch;
        System.out.println(ill); //65
        long lii = ch;
        System.out.println(lii);
        float f11 = ch;
        System.out.println(f11);
        double d11 =ch;
        System.out.println(d11);
    }
}
