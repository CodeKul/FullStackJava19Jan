package java8;

interface MyInterface2 {

    String message();

    default String call() {
        return "Hii from default";
    }

    static String myStatic(){
        return "This is static method";
    }

}

public class DefaultAndStaticKeywords implements MyInterface2 {

    public static void main(String[] args) {

        DefaultAndStaticKeywords obj = new DefaultAndStaticKeywords();
        System.out.println(obj.message());
        System.out.println(obj.call());
        System.out.println(MyInterface2.myStatic());
    }

    @Override
    public String message() {
        return "Hii message";
    }

    @Override
    public String call() {
        return "call";
    }
}