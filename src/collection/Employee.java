package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    String add;

    public Employee(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    @Override
    public int compareTo(Employee employee){
        return this.name.compareTo(employee.name);
    }



//    @Override
//    public int compareTo(Employee employee) {
//        if(this.id== employee.id){
//            return 0;
//        }else if(this.id> employee.id){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
}

class Main {

    public static void main(String[] args) {

        Employee e = new Employee(5, "aSahil", "Pune");
        Employee e2 = new Employee(4, "bSachin", "Pune Kothrud");
        Employee e3 = new Employee(1, "cSachin tendulkar", "Pune");

        List<Employee> list = new ArrayList<>();
        list.add(e);
        list.add(e2);
        list.add(e3);

        Collections.sort(list);
        list.forEach(s -> {
            System.out.println(s.add + " " + s.name);
        });


    }
}
