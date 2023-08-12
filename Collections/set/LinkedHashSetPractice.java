package Collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {

        //Insertion Order /NO Duplicates
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("NameOne");
        hashSet.add("NameTwo");
        hashSet.add("NameThree");
        hashSet.add("NameFour");
        hashSet.add("NameFour");
        hashSet.add("NameFive");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
