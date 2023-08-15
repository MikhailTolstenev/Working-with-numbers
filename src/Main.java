import javax.management.ObjectName;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intList2 = new ArrayList<>();
        for (Integer itr : intList) {
            if (itr>0 && itr%2==0 ) {
                intList2.add(itr);
            }
        }
        Collections.sort(intList2);
        System.out.println(intList2);
    }
}