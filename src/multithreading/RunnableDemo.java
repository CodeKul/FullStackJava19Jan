package multithreading;

public class RunnableDemo  implements Runnable {

    @Override
    public void run() {
        System.out.println("In Runnable run");
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
    }
}
