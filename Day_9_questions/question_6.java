class question_6 {
    public static void digit(int n) {
        while (n != 0) {
            int i = n % 10;
            n = n / 10;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n = 238;
        digit(n);
    }
}