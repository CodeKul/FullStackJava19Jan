package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream => stream is a sequence of objects and that have many methods and we combined and produce desired result.
 * Types of Stream ->
 *                   sequential and parallel stream -> parallel stream is used with multiple thread.
 * Operations -> terminal operation and intermediate operation
 * terminal operation => forEach(),reduce(),collect()
 * intermediate operation => map(Function) , filter(Predicate), sorted()
* */


public class StreamDemo {
    int id;
    String name;
    String address;
    int salary;

    public StreamDemo(int id, String name, String address,int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "StreamDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        StreamDemo streamDemo = new StreamDemo(1,"abc","Pune",9874);
        StreamDemo streamDemo1 = new StreamDemo(2,"abcd","Pune1",7060);
        StreamDemo streamDemo2 = new StreamDemo(3,"abcde","Pune2",5084);


        List<StreamDemo> list = new ArrayList<>();
        list.add(streamDemo);
        list.add(streamDemo1);
        list.add(streamDemo2);

        List<Integer> list1 =list.stream()
                .map(m->m.salary*2)
                .collect(Collectors.toList());

        System.out.println(list1);

        list.stream()
                .filter(f->f.salary>9000)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
