class most_repeated {
    public static void main(String[] args) {
        String str = "helolooo";
        char[] arr = str.toCharArray();
        int prev = 0, next, ans = -1;

        for (int i = 0; i < arr.length; i++) {
            next = 0;
            for (int j =0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    next++;
            }
            if (prev < next)
                ans = i;
        }
        System.out.println("Most repeat is " + arr[ans]);
    }
}