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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}

class MainComparetorDemo {
    public static void main(String[] args) {
        ComparatorDemo e = new ComparatorDemo(5, "aSahil", "Pune");
        ComparatorDemo e2 = new ComparatorDemo(1, "bSachin", "Pune Kothrud");
        ComparatorDemo e3 = new ComparatorDemo(1, "cSachin tendulkar", "Pune");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(e);
        list.add(e2);
        list.add(e3);

        Comparator<ComparatorDemo> comparator = (comparatorDemo,t1)-> {
                if (comparatorDemo.id > t1.id) {
                    return 1;
                } else {
                    return -1;
                }

        };

        Comparator<ComparatorDemo> comparator1 = (Comparator.comparing(ComparatorDemo::getId))
                .thenComparing(ComparatorDemo::getAdd)
                .thenComparing(ComparatorDemo::getName);

        Collections.sort(list,comparator1);
        list.forEach(s -> {
            System.out.println(s.add + " " + s.name);
        });
    }
}