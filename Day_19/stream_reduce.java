import java.util.*;
import java.util.stream.*;

public class stream_reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,20,40);

        List<Integer> evenlist = list.stream()
                                        .reduce((a,b) -> a + b)
                                        .collect(Collectors.toList());

        System.out.println(evenlist);
    }
}
