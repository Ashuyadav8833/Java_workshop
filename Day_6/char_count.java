class char_count {
    public static void main(String[] args) {
        String str = "hello";
        char[] arr = str.toCharArray();

        char input = 'l';
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == input)
                count++;
        }
        System.out.println("Number of " + input + " is " + count);
    }
}