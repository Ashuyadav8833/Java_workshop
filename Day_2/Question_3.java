import java.util.Scanner;

class Question_3 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a>b) {
            System.out.println("a is greater than b");
        } else if (a<b) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a is equal to b");
        }
    }
}