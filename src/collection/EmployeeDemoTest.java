package collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemoTest {

    int id;
    String name;
    String add;
    double salary;

    public EmployeeDemoTest(int id, String name, String add, double salary) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.salary = salary;
    }

}

class EmpMain{

    public static void main(String[] args) {
        List<EmployeeDemoTest> list = new ArrayList<>();
        EmployeeDemoTest employeeDemoTest = new EmployeeDemoTest(1,"abc","pune",343843);
        EmployeeDemoTest employeeDemoTest2 = new EmployeeDemoTest(2,"abcd","pune",343843);
        EmployeeDemoTest employeeDemoTest3 = new EmployeeDemoTest(3,"abcdf","pune",343843);

        list.add(employeeDemoTest);
        list.add(employeeDemoTest2);
        list.add(employeeDemoTest3);

        list.forEach(s->{
            System.out.println("id=>"+s.id+" name=>"+s.name);
        });

    }
}