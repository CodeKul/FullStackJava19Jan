package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {


        List<Integer> collection = new ArrayList();

        for (int i = 1; i < 10; i++) {
            collection.add(i);
        }

        collection.remove(5);

        collection.forEach(s->{
            System.out.println(s);
        });

    }
}
