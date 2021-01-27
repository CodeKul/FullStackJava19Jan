package datatypes;

public class Sample {

    int i = 0;
    int j = 1;

    public static void show(){
        System.out.println("Hii");
    }

    //public -> Access modifier
    //static -> JVM invoke the main method without creating the object of class
    public static void main(String[] args) {
//        DataTypes.Sample sample = new DataTypes.Sample();
        Sample.show();
    }

}
