package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    int id;
    String name;
    String add;

    public ComparatorDemo(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }
}

class MainComparetorDemo {
    public static void main(String[] args) {
        ComparatorDemo e = new ComparatorDemo(5, "aSahil", "Pune");
        ComparatorDemo e2 = new ComparatorDemo(4, "bSachin", "Pune Kothrud");
        ComparatorDemo e3 = new ComparatorDemo(1, "cSachin tendulkar", "Pune");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(e);
        list.add(e2);
        list.add(e3);

        Comparator<ComparatorDemo> comparator = new Comparator<ComparatorDemo>() {
            @Override
            public int compare(ComparatorDemo comparatorDemo, ComparatorDemo t1) {
                if (comparatorDemo.id > t1.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(list,comparator);
        list.forEach(s -> {
            System.out.println(s.add + " " + s.name);
        });
    }
}