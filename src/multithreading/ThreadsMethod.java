package multithreading;

public class ThreadsMethod {

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {

            for(int i=1;i<=5;i++){
                System.out.println("Hii");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"T1");

        Thread t2 = new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"T2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println("Exit");
    }

}
