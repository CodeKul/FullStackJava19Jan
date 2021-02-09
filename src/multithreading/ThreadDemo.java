package multithreading;


class Hii extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hii");
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try { Thread.sleep(500); } catch (InterruptedException e) { }

        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        Hii hii = new Hii();
        Hello hello = new Hello();

        hii.start();

        hello.start();
    }

}
