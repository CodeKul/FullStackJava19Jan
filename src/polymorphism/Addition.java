package polymorphism;

public class Addition {

    public void add(int a,int b){

        System.out.println(a + b);
    }

    public void add(float a,int b){

        System.out.println(a+b);
    }

    public void add(float a,float b){

        System.out.println(a+b);
    }

    public static void main(String[] args) {

        Addition addition = new Addition();
        addition.add(1,2);

        addition.add(1.9f,4);

        addition.add(1.7f,12.9f);
    }
}
