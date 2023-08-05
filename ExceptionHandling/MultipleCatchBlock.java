package ExceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 20;
            int c =0;

            System.out.println(a/b);
            //System.out.println(a/c); // java.lang.ArithmeticException

            int aa[] = {10,20,30,40,50};
            System.out.println(aa[0]);
            //System.out.println(aa[5]); //ArrayIndexOutOfBoundsException

            String s1 = null;
            //System.out.println(s1.length()); //java.lang.NullPionterException

            String s2 = "Hello Java";
            System.out.println(s2);
            System.out.println(s2.charAt(6));
        }catch (ArithmeticException e){
            System.out.println("Error is Arithmetic Exception"+e);
        }

    }
}
