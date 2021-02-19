package string;

//String buffer is mutable class means we can change the string
public class StringBufferDemo {
    public static void main(String[] args) {
        //it is synchronized
        //slow

        String s1 = "Codekul";
        StringBuffer stringBuffer = new StringBuffer(s1);
        stringBuffer.reverse();
        stringBuffer.append("Mumbai");
        System.out.println("SubString=>"+stringBuffer.substring(0,2));
        System.out.println("SubString=>"+stringBuffer.replace(0,2,"MP"));
        System.out.println(stringBuffer);

        //it is not synchronized
        //fast
        StringBuilder stringBuilder = new StringBuilder("Pune");
        stringBuilder.append("Mumbai");
        System.out.println(stringBuilder);
    }
}
