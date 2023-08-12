package Collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetPractice {
    public static void main(String[] args) {
        NavigableSet<Integer> treeset = new TreeSet<>();
        treeset.add(65);
        treeset.add(67);
        treeset.add(66);
        treeset.add(68);
        treeset.add(70);
        treeset.add(68);
        treeset.add(85);
        System.out.println(treeset);

        System.out.println(treeset.descendingSet());

        //greater than or equal to
        System.out.println(treeset.ceiling(69));
        System.out.println(treeset.ceiling(68));
        System.out.println(treeset.ceiling(71));

        //greater than
        System.out.println(treeset.higher(70));
        //greater than, less than, equal too
        System.out.println(treeset.floor(66));
        //less than
        System.out.println(treeset.lower(69));

        System.out.println(treeset.pollFirst());

        System.out.println(treeset.pollLast());


    }
}
