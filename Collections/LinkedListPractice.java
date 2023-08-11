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
        //addFirst() method on linkedlist
        linkedList.addFirst(100);
        System.out.println(linkedList);//[100, 10, 20, 30, 40, 50, 10, 30]

        //removeFirst()method on linkedlist
        linkedList.removeFirst();
        linkedList.remove(2);
        //removeLast() method on linked list
        linkedList.removeLast();

        System.out.println(linkedList);
        //addlast() method on linkedlist
        linkedList.addLast(300);
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
