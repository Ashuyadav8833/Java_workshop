class first_repeated {
    public static void main(String[] args) {
        String str = "priyanshusahu";
        String newstr = "";

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (newstr.indexOf(s) == -1) 
                newstr += s;
            else {
                System.out.println("Repeat :" + s);
                break;
            }
        }
        //System.out.println("New string is " + newstr);
    }
}