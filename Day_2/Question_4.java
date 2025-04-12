import java.util.Scanner;

class Question_4 {
    public static void main(String[] args) {
        char val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        val = sc.next().charAt(0);

        switch (val) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(val + " is a vowel.");
                break;
            default:
                System.out.println(val + " is a consonant.");
        }
    }
}