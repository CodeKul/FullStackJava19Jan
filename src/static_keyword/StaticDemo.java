package static_keyword;

public class StaticDemo {

    static String companyName = "ABC";
    int empId;
    String empName;

    StaticDemo(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public static void display() {
        System.out.println("In static method");
    }

    public static void main(String[] args) {

        StaticDemo staticDemo = new StaticDemo(1, "a1");
        StaticDemo staticDemo1 = new StaticDemo(2, "a2");
        StaticDemo staticDemo2 = new StaticDemo(3, "a3");
        StaticDemo staticDemo3 = new StaticDemo(4, "a4");

        staticDemo.show();
        staticDemo1.show();
        staticDemo2.show();
        staticDemo3.show();

        display();

    }

    public void show() {
        System.out.println("id=>" + empId + "name=>" + empName + "comanyName=>" + companyName);
    }

}
