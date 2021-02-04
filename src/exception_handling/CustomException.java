package exception_handling;

import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {
        int i=1;
        try {
            if(i>0){
                throw new Exception("i is greater than 0");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class MyException extends Exception{

    public MyException(String str){
        super(str);
    }

}
