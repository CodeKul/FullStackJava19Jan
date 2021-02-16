package try_catch;

public class Employee {

//    int id;
//    String name;
//    String add;

    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        try {
            try {
                int k = i / j;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic=>" + e);
            }

            String s = null;
            Integer.parseInt(s);
            System.out.println(s.length());

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Null =>" + e);
        } catch (Exception e) {
            System.out.println("Parent ex=>" + e);
        } finally {
            System.out.println("Finally Execute");
        }
    }
}
