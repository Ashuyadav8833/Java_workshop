class smallest_elements {
    static int small(int arr[]) {
        int s = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (s > arr[i])
                s = arr[i];
        }
        return s; 
    }
    public static void main(String[] args) {
        int arr[] = {7,4,9,2,5};

        int s = small(arr);

        System.out.println(s);
    }
}