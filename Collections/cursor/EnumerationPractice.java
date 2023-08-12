package Collections.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("NameOne");
        vector.add("NameTwo");
        vector.add("NameThree");
        vector.add("NameFour");
        System.out.println(vector);

        Enumeration<String> elements = vector.elements();
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
//            String string =(String) elements.nextElement();
        }
    }
}
