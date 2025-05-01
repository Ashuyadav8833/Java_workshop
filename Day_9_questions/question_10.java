class question_10 {
    static int rev(int num) {
        int rev = 0;
        while (num != 0) {
            rev += (num % 10);
            rev *= 10;
            num /= 10;
        }
        rev /= 10;
        return rev;
    }

    public static void main(String[] args) {
        int num1 = 121;

        if (rev(num1) == num1) 
            System.out.println(num1 + " is a palindrome");
        else
            System.out.println(num1 + " is not a palindrome");
    }
}