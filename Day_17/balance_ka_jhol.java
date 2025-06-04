class account extends Thread {
    static int balance;

    public account(int bal) {
        balance = bal;
    }

    public void start(int val) {
        if (val > balance)
            System.out.println("Insufficient Balance");
        else {
            System.out.println(val + " withdraw successful");
            balance -= val;
        }
        System.out.println("Available Balance : " + balance);
    }

    

    public void run(int val) {
        if(val > balance)
            System.out.println("Insufficient Balance !");
        else {
            balance -= val;
            System.out.println(val + " withdraw successful\n" + "Available Balance : " + balance);
        }
    }

    
}

public class balance_ka_jhol {
    public static void main(String[] args) {
        account a1 = new account(1000);
        account a2 = new account(1000);

        a1.start(800);
        a2.start(500);
    }
}
