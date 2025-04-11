import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int a = 10; 
        // int b = 5;
        
        System.out.println("Select an operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = 2; 

        switch (choice) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}