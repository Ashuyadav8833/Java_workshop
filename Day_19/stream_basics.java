
import java.util.*;
import java.util.stream.*;


public class stream_basics {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,20,40);

        List<Integer> evenlist = list.stream()
                                        .map(a -> a*5)
                                        .collect(Collectors.toList());

        System.out.println(evenlist);
    }
}
