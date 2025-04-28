class linear_search {
    public static int search (int arr[], int target) {
        int found = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                found = i;
                break;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int arr[] = {54,56,29,14};

        System.out.println("Index at " + search(arr, 14));
    }
}