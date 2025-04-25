class missing_element {
    public static void main(String[] args) {
        int arr[] = {1,2,4};

        int n = arr.length + 1;
        n = (n * (n + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        int ans = n - sum;

        System.out.println("missing : " + ans);
    }
}