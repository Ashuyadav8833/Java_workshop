
import java.util.Scanner;

class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if (n%5 == 0 && n%11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else if (n%5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else if (n%11 == 0) {
            System.out.println("The number is divisible by 11.");
        }
        else {
            System.out.println("The number is not divisible by 5 or 11.");
        }
    }
}