class MyRunnable implements Runnable { 
    public void run() { // Thread logic inside run()
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Pause thread for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable(); // Create Runnable object
        
        Thread t1 = new Thread(obj, "Thread-1"); // Create Thread and pass obj
        Thread t2 = new Thread(obj, "Thread-2"); 
        
        t1.start(); // Start first thread
        t2.start(); // Start second thread
    }
}
