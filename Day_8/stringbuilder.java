class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(14);
        str.append("bhai ka");

        System.out.println(str);
        //System.out.println(str.length());
        System.out.println(str.capacity());
    }
}