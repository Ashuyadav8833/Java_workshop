class question_8 {
    static int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 2988;
        System.out.println("Count of " + num + " is " + count(num));
    }
}