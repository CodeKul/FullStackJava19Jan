package polymorphism;

public class Substraction extends Addition{

    public void add(int a, int b){
        System.out.println("In sub");
    }

    public static void main(String[] args) {

        Substraction substraction = new Substraction();
        substraction.add(1,2);
    }
}
