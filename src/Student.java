public class Student {

    String name;
    int id;

    public  Student(String name,int id){
        System.out.println("Student name is=>"+name+"id is=>"+id);
    }


     static public void main(String[] args) {
        Student student = new Student("Sachin",3);
    }
}
