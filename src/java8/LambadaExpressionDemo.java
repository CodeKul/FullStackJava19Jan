package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface MyInterface {

    String show();
}

@FunctionalInterface
interface MyInterface1 {

    int add(int i, int j);
}

public class LambadaExpressionDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(123, 1323, 23, 32);

        Consumer<Integer> consumer = (Integer integer)-> {
                System.out.println(integer*2);
        };
        list.forEach(s->{
            System.out.println(s*2);
        });


        MyInterface myInterface = () -> {
            return "Hii";
        };

        System.out.println(myInterface.show());

        MyInterface1 myInterface1 = ( i,  j) -> {
            return i + j;
        };

        System.out.println(myInterface1.add(2, 3));
    }
}