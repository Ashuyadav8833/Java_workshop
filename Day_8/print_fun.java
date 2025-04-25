class print_fun {

    static int print(String intput) {
        System.out.println(intput);
        if(intput.isEmpty())
            return 0;
        else
            return 1;
    }

    public static void main(String[] args) {
        print("hello");
    }
}