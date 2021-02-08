package multithreading;

public class RunnableDemo extends Sample implements Runnable {

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
