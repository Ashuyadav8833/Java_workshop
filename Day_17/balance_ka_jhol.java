class account extends Thread {
    static int balance=1000;
    int bal;

    public account(int bal) {
        this.bal = bal;
    }

    // public void start(int val) {
    //     if (val > balance)
    //         System.out.println("Insufficient Balance");
    //     else {
    //         System.out.println(val + " withdraw successful");
    //         balance -= val;
    //     }
    //     System.out.println("Available Balance : " + balance);
    // }

    

    public void run() {
        if(bal > balance)
            System.out.println("Insufficient Balance !");
        else {
            System.out.println("val");
            balance -= bal;
            System.out.println(bal + " withdraw successful\n" + "Available Balance : " + balance);
        }
    }

    
}

public class balance_ka_jhol {
    public static void main(String[] args) {
        account a1 = new account(800);
        account a2 = new account(500);
        a1.start();
        a2.start();

  
    }
}
