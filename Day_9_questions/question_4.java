class question_4 {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        int n = 4;
        
        System.out.println("Sum is : " + sum(n));
    }
}