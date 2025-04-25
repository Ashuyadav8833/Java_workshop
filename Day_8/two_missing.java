class two_missing {
    public static void main(String[] args) {
        int arr[] = {1,2,5};

        int n = arr.length + 2;
        n = (n * (n + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        int ans = n - sum;

        System.out.println("missing1 : " + ans / 2);
        System.out.println("missing1 : " + (ans + 1)/ 2);
    }
}