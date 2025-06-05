
public class thread_again {
    public static void main(String[] args) {
        System.out.println("Pehle me....");

        Thread pehlaThread = new Thread(()->{
            System.out.println("Aur Sunao !");
        });

        Thread dusriThread = new Thread(()->{
            System.out.println("Sab Badhiya");
        });

        pehlaThread.start();
        dusriThread.start();
    }
}
