class Question_6 {
    public static void main(String arg[]) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println(a + " " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}