package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface MyInterface {

    String show();
}

interface MyInterface1 {

    int add(int i, int j);
}

public class LambadaExpressionDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(123, 1323, 23, 32);


        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        list.forEach(consumer);


        MyInterface myInterface = () -> {
            return "Hii";
        };

        System.out.println(myInterface.show());

        MyInterface1 myInterface1 = (i, j) -> {
            return i + j;
        };

        System.out.println(myInterface1.add(2, 3));
    }
}