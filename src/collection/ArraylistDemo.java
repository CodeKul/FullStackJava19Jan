package collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

    public static void main(String[] args) {


        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 11;
        arr[3] = 12;
        arr[4] = 13;
        arr[5] = 14;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        System.out.println(list);

        //enhanced for loop
        for(int i:list){
            System.out.println(i);
        }

        //traditional for loop
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        //forEach lambda expression
        list.forEach((s)->{
            System.out.println(s);
        });

        //Method reference
        list.forEach(System.out::println);


    }
}
