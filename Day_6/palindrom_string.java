class palindrom_string {
    public static void main(String[] args) {
        String str1 = "tsest";
        boolean flag = true;
        
        int size = str1.length()+1 /2;
        size--;

        for (int i = 0; i < size; i++) {
            if (str1.charAt(i) != str1.charAt(size - i)) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("It is a palindrome");
        else
            System.out.println("Not a palindrome");
    }
}