package StringPractice;

public class BufferAndBuilder {
    public static void main(String[] args) {
        //Immutable
        String s1 = "Java";
        System.out.println(s1);

        String s2 = new String("Python");
        System.out.println(s2);

        //Mutable
        //Synchronized
        StringBuffer sb1 = new StringBuffer("JavaScript");
        System.out.println(sb1);
        System.out.println(sb1.append("Reactjs"));
        System.out.println(sb1);

        //not a synchronized
        //since 1.5
        StringBuilder sb2 = new StringBuilder("Nodejs");
        System.out.println(sb2);
        System.out.println(sb2.append("reactnative"));
        System.out.println(sb2);
    }
}
