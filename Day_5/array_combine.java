class array_combine {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};

        int sum[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum[arr1.length + i] = arr2[i];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Element " + i + ": " + sum[i]);
        }
    }
}