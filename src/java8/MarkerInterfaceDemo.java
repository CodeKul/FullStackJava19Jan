package java8;

interface MarkerInterface {

}

public class MarkerInterfaceDemo implements MarkerInterface {

    public static void main(String[] args) {

        MarkerInterfaceDemo markerInterfaceDemo = new MarkerInterfaceDemo();

        if (markerInterfaceDemo instanceof MarkerInterface) {
            markerInterfaceDemo.show();
        }
    }

    public void show() {
        System.out.println("In show method");
    }
}
