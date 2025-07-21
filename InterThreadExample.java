class Data {
    int value;
    boolean produced = false;

    synchronized void produce(int val) {
        while (produced) {
            try { wait(); } catch (InterruptedException e) {}
        }
        this.value = val;
        System.out.println("Produced: " + val);
        produced = true;
        notify();
    }

    synchronized void consume() {
        while (!produced) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Consumed: " + value);
        produced = false;
        notify();
    }
}

class Producer extends Thread {
    Data data;
    Producer(Data d) { this.data = d; }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}

class Consumer extends Thread {
    Data data;
    Consumer(Data d) { this.data = d; }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}

public class InterThreadExample {
    public static void main(String[] args) {
        Data data = new Data();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}
