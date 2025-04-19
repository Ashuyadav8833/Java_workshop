class max_from_two {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,1};
        int max = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max) 
                max = arr2[i];
        }
        System.out.println("Maximum from two array is : " + max);
    }
}