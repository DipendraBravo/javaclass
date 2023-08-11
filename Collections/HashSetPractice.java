package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(10);
        System.out.println(arrayList);//[10, 20, 30, 40, 10]
        System.out.println(arrayList.size());
        //remove duplicate elements in arraylist
        HashSet<Integer> hashSet = new HashSet<Integer>(arrayList);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
    }
}
