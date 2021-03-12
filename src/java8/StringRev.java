package java8;

public class StringRev {

    public static void main(String[] args) {
        String string = "Java";
//        StringBuffer stringBuffer = new StringBuffer(string);
//        stringBuffer.reverse();
//        System.out.println(stringBuffer);

        String rev = "";

        for(int i= string.length()-1; i>=0;i--){
            rev = rev +string.charAt(i);
        }

        System.out.println(rev);


    }

}

