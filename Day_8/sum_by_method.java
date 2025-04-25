class sum_by_method {
    static void sum(int dig) {
        int sum = 0;
        while(dig > 0) {
            sum += dig%10;
            dig /= 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(245);
    }
}