package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDecalrationTypes {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(12);
        list.add(12);
        list.add(12);

        List<Integer> list1 =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 45));

        System.out.println(list1);

        List<Integer> list2 =
                new ArrayList<>(List.of(1, 23, 3, 5));

        List<Integer> list3 =
                new ArrayList<>() {{
                    add(1);
                    add(2);
                    add(3);
                }};
    }
}
