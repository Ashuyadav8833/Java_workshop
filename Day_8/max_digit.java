class max_digit {
    static int max(int a, int b) {
        int sum1 = 0, sum2 = 0;
        while (a > 0) {
            sum1 += a%10;
            a /= 10;
        }
        while (b > 0) {
            sum2 += b%10;
            b /= 10;
        }
        if (sum1 > sum2)
            return sum1;
        else
            return sum2;
    }
    public static void main(String[] args) {
        System.out.println(max(23,66));
    }
}