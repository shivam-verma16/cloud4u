import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class JavaSorting {
    static Logger logger = Logger.getLogger(JavaSorting.class.getName());
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,1,4,5,76,77,7844,67);

        // natural sorting
       list.stream().sorted().forEach(System.out::println);

       // reverse sorting
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }


}