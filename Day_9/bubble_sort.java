class bubble_sort {

    public static void bubble (int arr[]) {
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= arr.length - i ; j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,9,3,6};
        bubble(arr);
    }
}