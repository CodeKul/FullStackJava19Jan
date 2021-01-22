package thiskeyword;

public class Employee {

    //Instance variable
    int id;
    String name;
    String address;

    public Employee(int id, String name, String address) {//Local variable

        this.id = id;
        this.name = name;
        this.address = address;
    }

    private void display() {
        System.out.println("In display");
    }

    public void show() {
        this.display();
        System.out.println("Id " + id + " name " + name + " address " + address);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Sachin", "Pune");
        employee.show();


    }
}

