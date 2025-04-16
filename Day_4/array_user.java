
import java.util.Scanner;

class array_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            //System.out.print("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}