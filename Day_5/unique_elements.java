class unique_elements {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,9,8,2};

        boolean unique = true;

        for (int i = 0; i < arr1.length; i++) {
            unique = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                    System.out.println(arr1[i] + " is unique");
        }

        for (int i = 0; i < arr2.length; i++) {
            unique = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                    System.out.println(arr2[i] + " is unique");
        }
    }
}