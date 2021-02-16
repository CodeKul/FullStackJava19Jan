package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {

    public static void main(String[] args) {


        List<Map<Integer, String>> list = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "String 1");
        map.put(2, "String 2");
        map.put(3, "String 3");
        map.put(4, "String 4");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "String 11");
        map1.put(2, "String 22");
        map1.put(3, "String 33");
        map1.put(4, "String 44");


        list.add(map);
        list.add(map1);


        list.forEach(s -> {
            s.forEach((k, v) -> {
                System.out.println(k + " " + v);
            });
        });


    }
}
