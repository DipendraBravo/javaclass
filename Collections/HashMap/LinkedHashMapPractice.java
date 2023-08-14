package Collections.HashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapPractice {
    public static void main(String[] args) {

        //ordered Elements,Duplicate values Allowed, Duplicate values Allowed and overried the data with key
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2,"NameTwo");
        linkedHashMap.put(2,"NameTwoDuplicated");
        linkedHashMap.put(3,"NameThree");
        linkedHashMap.put(1,"NameOne");
        linkedHashMap.put(4,"NameFour");
        linkedHashMap.put(5,"NameFive");
        System.out.println(linkedHashMap);
    }
}
