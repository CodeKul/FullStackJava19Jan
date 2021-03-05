package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReferences {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(12,2,321,23,21,3);
//        list.forEach(System.out::println);

        MethodReferences methodReferences = new MethodReferences();
        MyInterface3 myInterface3 = methodReferences::display;
        System.out.println(myInterface3.msg());


        BiFunction<Integer,Integer,Integer> addition = MyInterface4::add;

        int i = addition.apply(3,5);
        System.out.println();
    }

    private String display(){
        return "Hii";
    }
}

@FunctionalInterface
interface MyInterface3{
    String msg();

}

interface MyInterface4{

    public static int add(int i,int j){
        return i+j;
    }
}


