class question_9 {
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
        int num1 = 123;

        System.out.println("Reverse of " + num1 + " is " + rev(num1));
    }
}