package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferences {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(12,2,321,23,21,3);
//        list.forEach(System.out::println);

        MethodReferences methodReferences = new MethodReferences();
        MyInterface3 myInterface3 = methodReferences::display;
        System.out.println(myInterface3.msg());
    }

    private String display(){
        return "Hii";
    }
}

@FunctionalInterface
interface MyInterface3{
    String msg();

}


