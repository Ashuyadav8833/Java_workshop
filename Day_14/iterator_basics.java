
// import java.util.ArrayList;
import java.util.*;

public class iterator_basics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Raju");
        list.add("Aksh");
        list.add("Priyanshu");
        list.add("Akshu");

        ListIterator<String> it = list.listIterator();

        System.out.println(list);

        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);

            if (data.length() < 3) {
                it.
            }
        }

        // while (it.hasPrevious()) {
        //     String data = it.previous();
        //     System.out.println(data);
        // }
    }
}
