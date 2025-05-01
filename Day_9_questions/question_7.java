class question_7 {

    static int sum(int num) {
        int sum = 0;
        while (num!=0) {
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 529;
        System.out.println("Sum of " + num + " is " + sum(num));
    }
}