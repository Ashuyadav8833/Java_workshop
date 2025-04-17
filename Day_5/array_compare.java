class array_compare {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};

        boolean equal = true;

        if (arr1.length != arr2.length) {
            equal = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("Both arrays are same ");
        } else {
            System.out.println("Both are not same ");
        }
    }
}