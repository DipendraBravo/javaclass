package Collections.set;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {

        //No insertion order / No Duplicates
        HashSet<String> hashSet = new HashSet<>();
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
