package multithreading;

public class ProducerConsumer {

    int num;
    boolean flag=false;

    public synchronized void put(int num) {
        while (flag){
           try { wait();}catch (Exception e){}
        }
        System.out.println("Put:" + num);
        this.num = num;
        flag =true;
        notify();
    }

    public synchronized void get() {
        while (!flag){
            try { wait();}catch (Exception e){}
        }
        System.out.println("Get:" + num);
        flag =false;
        notify();
    }
}

class Producer implements Runnable{

    ProducerConsumer producerConsumer;

    public Producer(ProducerConsumer producerConsumer){
        this.producerConsumer =producerConsumer;
        Thread thread = new Thread(this,"Producer");
        thread.start();
    }


    @Override
    public void run() {
            int i=0;

            while (true){
                producerConsumer.put(i++);
                try{Thread.sleep(100);}catch (Exception e){}
            }
    }
}
 class Consumer implements Runnable{

    ProducerConsumer producerConsumer;

    public Consumer(ProducerConsumer producerConsumer){
        this.producerConsumer =producerConsumer;
        Thread thread = new Thread(this,"Consumer");
        thread.start();
    }


    @Override
    public void run() {
            while (true){
               producerConsumer.get();
                try{Thread.sleep(500);}catch (Exception e){}
            }
    }
}

class InterThreadComm{

    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        new Producer(producerConsumer);
        new Consumer(producerConsumer);
    }
}