
import java.util.Scanner;

class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;

        while (n>0) {
            sum += n;
            n--;
        }
        System.out.println("Sum of first n natural numbers is : " + sum);
    }
}