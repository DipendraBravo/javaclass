package StringPractice;

public class PracticeOne {
    public static void main(String[] args) {
        //String
        //Strings are sequence of characters
        char ch[]={'D','i','p','e','n'};
        System.out.println(ch);

        //String is immutable, once we create we cannot modify it.

        //Ways to create a String
        //2ways

        //Using literal
        String s1 = "Dipendra";
        System.out.println(s1); // 1 (scp) string constant pool

        //Using new Keyword
        String s2 = new String("Dipendra"); //2 (scp) (heap)
        System.out.println(s2);

        //Using new Keyword
        String s3 = new String("Dipendra"); //2 (scp) (heap)
        System.out.println(s3);

        //content comparison
        //literals
        System.out.println(s1.equals(s2));
        //new keyword
        System.out.println(s2.equals(s3));

        //reference comparison
        //literals
        System.out.println(s1 == s2);

        //new keyword
        System.out.println(s2 == s3); //provides false because of different memory allocation

        String small = "java";
        String big = "Java";
        System.out.println(small.equalsIgnoreCase(big));//true

        //concat of string
        String c1 ="Java";
        String c2 ="Python";
        String c3 = c1.concat(c2);
        System.out.println(c3);//JavaPython

        String c4 = c1.concat("Javascript").concat("PHP");
        System.out.println(c4); //JavaJavascriptPHP

        String c5 ="JavaPython";
        //literals equals()
        System.out.println(c5.equals(c3)); //true

        //literals ref
        System.out.println(c5 == c3); //false

        String c6 ="JavaPython";

        //Literals ref
        System.out.println(c5 == c6);//true


    }
}
