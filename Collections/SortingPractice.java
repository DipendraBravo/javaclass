package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class SortingPractice {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("B");
        arrayList.add("F");
        arrayList.add("E");
        System.out.println("Insertion Order/Ordered Elements:"+arrayList);
        arrayList.sort(null);
        System.out.println("Sorting order:"+ arrayList);

        LinkedList<String> list = new LinkedList<>();
        list.add("C");
        list.add("A");
        list.add("D");
        list.add("B");
        list.add("E");
        System.out.println("Insertion Order/Ordered Elements:"+list);
        list.sort(null);
        System.out.println("Sorting order:"+ list);

    }
}
