package Collections.set;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {

        //Natural Sorting order //No duplicate value
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("C");
        treeSet.add("C");
        treeSet.add("E");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("G");
        treeSet.add("F");
        treeSet.add("H");
        System.out.println(treeSet);
    }
}
