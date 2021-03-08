package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class HigherOrderFunction {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BiFunction<List<Integer>, Predicate<Integer>,List<Integer>> filter;

        filter = (lst,predicate)->{
            List<Integer> result = new ArrayList<>();

            for(Integer i: lst){
                if(predicate.test(i)){
                    result.add(i);
                }
            }
            return result;
        };


        System.out.println(filter.apply(list,x->x%2 != 0));

        int i = ((BiFunction<String,String,Integer>)String::indexOf)
                .andThen(Integer::intValue)
                .apply("String","n");

        System.out.println(i);
    }
}
