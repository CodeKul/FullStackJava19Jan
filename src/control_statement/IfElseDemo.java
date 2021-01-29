package control_statement;

public class IfElseDemo {
    public static void main(String[] args) {
       int a,b,c,d;
       a =10211;
       b=192111;
       c=2211111;
       d=0;
    //multiple if conditions
       if(a>b && a>c && a>d){
           System.out.println("a is biggest");
       }else if(b>c && b>d){
           System.out.println("b is biggest");
       }else if(c>d){
           System.out.println("c is biggest");
       }else {
           System.out.println("d is biggest");
       }


       //single if condition
        int i =10;
        if(i>0){
            System.out.println("i is positive");
        }else {
            System.out.println("i is -ve");
        }

        int age = 19;
        String nationalty = "Pak";
        if(age>18){
            if(nationalty=="India"){
                System.out.println("you can vote");
            }else {
                System.out.println("Not Indian");
            }
        }else {
            System.out.println("you can not vote");
        }



        //ternary operator
       int s= i==10?100:1;
        System.out.println(s);
    }
}
