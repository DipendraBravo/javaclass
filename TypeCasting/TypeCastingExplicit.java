package TypeCasting;

public class TypeCastingExplicit {
    public static void main(String[] args) {
        //Explicit Casting
        //double-float-long-int-short-byte
        //------------------char

        double d1 =10;
        float f1 =(float)d1;
        System.out.println(f1);

        long l1 =(long)f1;
        System.out.println(l1);

        int il =(int)l1;
        System.out.println(il);

        short s1 =(short) il;
        System.out.println(s1);

        byte b1 = (byte)s1;
        System.out.println(b1);

        char ch='A';
        short s11 = (short)ch;
        System.out.println(s11);


        double d2 = 10;
        byte b2 = (byte)(short)(int)(long)(float)(double)d2;
        System.out.println(b2);

        short s3 = (byte)(short)(int)(long)(float)(double)d2;
        System.out.println(s3);
    }
}
