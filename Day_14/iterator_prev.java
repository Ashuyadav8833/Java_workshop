import java.util.*;

public class iterator_prev {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Raju");
        list.add("Aksh");
        list.add("Priyanshu");
        list.add("Akshu");

        Iterator<String> it = list.iterator();
        
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
        }
    }
}
