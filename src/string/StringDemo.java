package string;


//String immutable - means unchangeable
public class StringDemo {

    public static void main(String[] args) {

        char[] arr = {'c','o','d','e'};
        String s = new String(arr);
        System.out.println(s);

        String s1 = new String("Pune");//Object of String class
        String s2 = "Mumbai"; //String literal
//        String s3 = "Mumbai"; //String literal
        s2.concat("Pune");
        s2 = s2.concat("Pune");
        System.out.println(s2);


        // ==,equals(),compareTo()

        String a1 = "Code";
        String a2 = "Code";
        String a3 = new String("Code");
        String a4= new String("Code");

        System.out.println(a4==a3);//reference
        System.out.println(a4.equals(a3));// content





    }
}
