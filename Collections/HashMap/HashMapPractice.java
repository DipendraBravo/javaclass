package Collections.HashMap;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5,"NameFive");
        hashMap.put(3,"NameThree");
        hashMap.put(1,"NameOne");
        hashMap.put(4,"NameFour");
        hashMap.put(2,"NameTwo");
        hashMap.put(2,"NameTwoDuplicate");//values is duplicated and overrides
        hashMap.put(6,"NameFive");//value is duplicated
        hashMap.put(7,null);//null as a valued allowed mutiple times
        hashMap.put(8,null);
        hashMap.put(null,null);//null as keu allowed only one time
        hashMap.put(null,null);
        System.out.println(hashMap);


    }
}
