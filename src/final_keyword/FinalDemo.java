package final_keyword;

import static_keyword.StaticDemo;

public class FinalDemo {
    final int i =5;//final variable

    public static void main(String[] args) {

        A a = new B();
        a.show();

        StaticDemo.display();
    }
}

class A{  //if you make final class it can't extends

    final public void show(){ // final method can not override
        System.out.println("In A show");
    }
}

class B extends A{
//
//    public void show(){
//        System.out.println("In B class ");
//    }

}