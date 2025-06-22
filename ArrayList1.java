import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size =" + number.size());
        // Adding number
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        System.out.print("");

        System.out.print("Total Contains Before Removing: ");
        @SuppressWarnings("rawtypes")
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());

        }

        // for (int x : number) {
        // System.out.print(" "+x);
        //
        // }
        System.out.println();

        // System.out.println(number);
        System.out.println("Size =" + number.size());
        // number.clear();
        // System.out.println("After clear contains: "+number);
        boolean check = number.isEmpty();
        System.out.println("ArrayList Empty: " + check);

        boolean contains = number.contains(30);
        System.out.println("This number in this list: " + contains);

        int position = number.indexOf(20);
        System.out.println("Number of index: " + position);

        number.set(3, 50);// set method always use for number or contains replacement
        System.out.println("After setting: " + number);

        int get = number.get(0);// check index of contains
        System.out.println("Index 0 :" + get);

    }

}
