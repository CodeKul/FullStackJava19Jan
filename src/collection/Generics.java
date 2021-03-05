package collection;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        show(list);


        List<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("abc1");
        strings.add("abc2");
        show(strings);
    }


    private static void show(List<?> list){

        list.forEach(s->{
            System.out.println(s);
        });
    }
}
