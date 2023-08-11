package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(10);
        linkedList.add(30);
        System.out.println(linkedList);

        linkedList.remove(0);
        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.set(4,400);
        System.out.println(linkedList);

        linkedList.add(5,500);
        System.out.println(linkedList);

        //Null
        List<String> arrayList = new ArrayList<>();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        System.out.println(arrayList);

        arrayList.add(0,null);
        System.out.println(arrayList);

        //null
        LinkedList<String> list = new LinkedList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
    }
}
