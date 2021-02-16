package collection;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        //Arraylist maintain insertion order
        //Arraylist can store duplicate elements
        List<Integer> list = new ArrayList<>();
        list.add(112);
        list.add(12);
        list.add(12);
        list.add(1);

        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

        //Linked list maintains insertion order
        //it store duplicate value
        List<Integer> list1 = new LinkedList<>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        System.out.println("LinkedList=>" + list1);


        //Set doesn't store duplicate element
        // Set doesn't maintain insertion order
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(15);
        set.add(10);
        set.add(12);

        System.out.println(set);

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(11);
        linkedSet.add(12);
        linkedSet.add(135);
        linkedSet.add(14);
        System.out.println("Linked hash Set =>" + linkedSet);

        //Map doesn't contains duplicate keys,
        // but it stores Duplicate values
        Map<Integer, Integer> map = new HashMap<>();
        map.put(10, 25);
        map.put(11, 26);
        map.put(12, 27);
        map.put(13, 28);

        System.out.println(map.get(10));

        System.out.println(map);
    }
}
