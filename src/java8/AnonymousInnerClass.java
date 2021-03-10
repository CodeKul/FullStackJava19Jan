package java8;


public class AnonymousInnerClass {


    public static void main(String[] args) {

        Addtition<Integer> addtition = new Addtition<>() {
            @Override
            Integer add(Integer i, Integer j) {
                return i+j;
            }
        };

        System.out.println(addtition.add(9, 8));
    }

}


abstract class Addtition<T> {

    abstract T add(T i, T j);

}