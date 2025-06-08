
import java.util.*;
import java.util.stream.*;

public class stream_question {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,10,20,40,80,100);

        List<Integer> evenlist = list.stream()
                                        .filter(a -> a > 2)
                                        .map(a -> a*2)
                                        .collect(Collectors.toList());

        System.out.println(evenlist);
    }
}
