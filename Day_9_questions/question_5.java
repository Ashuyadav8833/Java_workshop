class question_5 {
    public static int product(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++)
            product *= i;

        return product;
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Product is : " + product(n));
    }
}