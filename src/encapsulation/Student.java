package encapsulation;

public class Student {

    private int id;
    private String name;

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Sachin");
        System.out.println(student.getId());
        System.out.println(student.getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

class College {

    public static void main(String[] args) {
        Student student = new Student();

    }
}