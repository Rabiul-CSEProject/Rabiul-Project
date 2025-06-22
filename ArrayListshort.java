import java.util.ArrayList;
import java.util.Collections;

public class ArrayListshort {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(-2);
        number.add(14);
        number.add(-10);
        number.add(15);
        number.add(19);
        System.out.println("All Contains in List(Before Sorted):" + number);
        // sort method use
        Collections.sort(number);
        System.out.println("After sorting in Ascending Order:" + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After sorting in descending:" + number);
    }

}
