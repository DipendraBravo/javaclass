package Collections.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("NameOne");
        list.add("NameTwo");
        list.add("NameThree");
        list.add("NameFour");
        System.out.println(list);

        Iterator<String> iterator =list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
