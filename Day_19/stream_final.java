import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_final {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,10,20,40,80,100);

        List<Integer> evenlist = list.stream()
                                        .filter(a -> a > 2)
                                        .map(a -> a*2)
                                        .collect(Collectors.toList());

        System.out.println(evenlist);
    }
}
