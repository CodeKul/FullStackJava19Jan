package datatypes;

public class DataTypes {

    //primitive datatypes
    int i = 0;
    char j = 'c';
    boolean b = false;
    float f = 1.0f;
    long w = 10;
    byte s= 's';


    //non primitive datatypes

    String s1 = "Akshay";
    String s11 = "K";
    Integer q = 0;
    Double d = 1.0;
    Character c = 'd';

    private void getInfo() {
        System.out.println("hii");
    }

    static public void main(String... args) {
        DataTypes d1 = new DataTypes();
        d1.getInfo();

    }

}
