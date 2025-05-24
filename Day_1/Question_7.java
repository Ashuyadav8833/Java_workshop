class Question_7 {
    public static void main(String arg[]) {
        int a = 10;
        int b = 30;

        System.out.println(a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}