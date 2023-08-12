package Collections;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
//        vector.add("NameOne");
//        vector.add("NameTwo");
//        vector.add("NameThree");
//        vector.add("NameFour");
//        vector.add("NameFive");
        //addElement function()
            vector.addElement("NameOne");
            vector.addElement("NameTwo");
            vector.addElement("NameThree");
            vector.addElement("NameFour");
            vector.addElement("NameFive");
            vector.addElement("NameFive");
            System.out.println(vector);
        //fetching first element and last element
        System.out.println(vector.lastElement());
        System.out.println(vector.firstElement());
            //helps to clear the vector
            vector.clear();
        System.out.println(vector);

        //passing object in the constructor
        Vector<String> v = new Vector<>(vector);
        v.add("NameSix");
        v.add("NameSeven");
        System.out.println(v);



    }
}
