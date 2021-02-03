package exception_handling;

import java.io.IOException;

public class ThrowsDemo {

    private void a(){
        throw new ArithmeticException("in a");
    }

    private void b(){
        a();
        throw new ArithmeticException("in b");
    }

    private void c(){
        try{
            b();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThrowsDemo demo =new ThrowsDemo();
        demo.c();
    }
}

