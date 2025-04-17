class comman_element{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,9,8,2};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    System.out.println("Equal to " + arr1[i] + " is in second arr at position " + j);
            }
        }
    }
}