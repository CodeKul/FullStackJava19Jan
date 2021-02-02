package try_catch;

import kotlin.jvm.Throws;

import java.util.ArrayList;
import java.util.List;

public class TryCatchDemo {

    public static void main(String[] args) {

        try{
            try {
            int i=10;
            int j=0;
            int k=i/j;

            System.out.println(k);
            }catch (ArithmeticException e){
                System.out.println("e"+e);
            }
            String s = null;
            long sle = s.length();
        }catch (ArithmeticException arithmeticException){
            System.out.println("Arithmetic exception"+arithmeticException);
        }catch (NullPointerException nullPointerException){
            System.out.println("Null pointer "+nullPointerException);
        }catch (Exception e){
            System.out.println("e =>"+e);
        }


        List<String> list = new ArrayList<>();

    }
}
