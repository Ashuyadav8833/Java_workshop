class variables {
    int instance = 10;
    static int globalvar = 20;
    public static void main(String[] args) {
        int local = 30;

        variables var = new variables();

        System.out.println(globalvar);
        System.out.println(var.instance);
        System.out.println(local);
    }
}