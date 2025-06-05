
class Mythread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is running...");
            // Thread.yield();
        }
    }
}

public class thread_priority {
    public static void main(String[] args) {
        Mythread pehliMythread = new Mythread();
        Mythread dusriMythread = new Mythread();

        pehliMythread.setPriority(1);
        dusriMythread.setPriority(10);

        pehliMythread.start();
        dusriMythread.start();
    }
}
