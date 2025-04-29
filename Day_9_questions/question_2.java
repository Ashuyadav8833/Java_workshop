class question_2 {
    public static void even(int a, int b) {
        for (int i = a; i <= b; i++) {
            if ((i % 2)==0)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int a = 2, b = 9;
        even(a, b);
    }
}