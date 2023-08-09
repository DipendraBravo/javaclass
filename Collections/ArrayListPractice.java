package Collections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(10);
        System.out.println(arrayList);//[10, 20, 30, 40, 10]

        arrayList.add(2,200);
        arrayList.add(4,400);
        arrayList.add(6,600);
        System.out.println(arrayList);//[10, 20, 200, 30, 400, 40, 600, 10]

        arrayList.add(0,1000);
        System.out.println(arrayList);//[1000, 10, 20, 200, 30, 400, 40, 600, 10]

        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(10000);
        list.add(20000);
        list.add(30000);
        list.add(40000);
        list.addAll(0,arrayList);
        System.out.println(list); //[1000, 10, 20, 200, 30, 400, 40, 600, 10, 10000, 20000, 30000, 40000]
        System.out.println(list.size());
        list.add(13,50000);
        System.out.println(list);

        //set for update the list
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("NameOne");
        list1.add("NameTwo");
        list1.add("NameThree");
        list1.add("NameFour");
        System.out.println(list1);//[NameOne, NameTwo, NameThree, NameFour]
        System.out.println(list1.size());

        list1.set(0,"Dipendra Tamang");
        System.out.println(list1);//[Dipendra Tamang, NameTwo, NameThree, NameFour]
        System.out.println(list1.size());



    }
}
