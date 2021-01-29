import java.util.Scanner;

public abstract class Vehical {
    public abstract void start();
    public void color(){
        System.out.println("color is red");
    }
}

class BMW extends Vehical{

    @Override
    public void start() {

        System.out.println("Car Starting");
    }

    public static void main(String[] args) {

    }
}
