package inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Multiplication multiplication =  new Multiplication();
        multiplication.a=4;
        multiplication.b=2;
        multiplication.sub();
        System.out.println(multiplication.c);

        multiplication.add();
        System.out.println(multiplication.c);

        multiplication.multi();
        System.out.println(multiplication.c);
    }
}

//base Class ,Parent class , super class

class Addition{
    int a,b,c;


    public void add(){
        c= a+b;
    }
}

//sub class , child class, deriveed class
class Substraction extends  Addition{

    public void sub(){
        c=a-b;
    }
}

class Multiplication extends Substraction{

    public void multi(){
        c= a*b;
    }
}