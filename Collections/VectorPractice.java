package Collections;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("NameOne");
        vector.add("NameTwo");
        vector.add("NameThree");
        vector.add("NameFour");
        vector.add("NameFive");
        System.out.println(vector);

        //passing object in the constructor
        Vector<String> v = new Vector<>(vector);
        v.add("NameSix");
        v.add("NameSeven");
        System.out.println(v);

    }
}
