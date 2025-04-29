class string_sort {
    public static void main(String[] args) {
        String str[] = {"BE","A","C","D"};
        int mainlength = 0;

        for (int i = 0; i < str.length; i++) {
            mainlength += str[i].length();
        }

        char arr_main[] = new char[mainlength];
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            char arr[] = str[i].toCharArray();
            count += arr.length;
            int k = 0;
            for (int j = count-arr.length; j < count; j++, k++) {
                arr_main[j] = arr[k];
            }
                
        }
        for (int i = 0; i < arr_main.length-1; i++) {
            for (int j = 0; j < arr_main.length - i - 1; j++) {
                if (arr_main[j] > arr_main[j+1]) {
                    char temp = arr_main[j];
                    arr_main[j] = arr_main[j+1];
                    arr_main[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr_main.length; i++) {
            System.out.println(arr_main[i]);
        }
            
    }
}