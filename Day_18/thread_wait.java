
public class thread_wait {

    private boolean isSignalled = false;

    public synchronized void sendSignal() {
        isSignalled = true;
        System.out.println("Producer: Sending signal...");
        notify();
    }

    public synchronized void waitForSignal() {
        while (!isSignalled) {
            try {
                System.out.println("Consumer: Waiting for signal...");
                wait();
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Consumer: Got the signal! Proceeding...");
    }

    public static void main(String[] args) {
        thread_wait obj = new thread_wait();

        Thread consumer = new Thread(() -> {
            obj.waitForSignal();
        });

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            obj.sendSignal();
        });

        consumer.start();
        producer.start();
    }
}