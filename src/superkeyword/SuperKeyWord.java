package superkeyword;

public class SuperKeyWord {

    public static void main(String[] args) {
        B b = new B(2);
    }
}


class A extends Object {

    public A(int i) {

        System.out.println("In A Class Constructor");
    }

    public A() {
        System.out.println("In A class const");
    }
}

class B extends A {

    public B(int i) {
        super(i);
        System.out.println("In B Class Constructor");
    }
}