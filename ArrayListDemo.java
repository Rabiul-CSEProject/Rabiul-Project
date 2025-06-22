import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
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
        // Removing Number
        number.remove(2);
        System.out.print("After Removing :" + number);
        // after all number removing from these list
        number.removeAll(number);

        System.out.println();

        System.out.print("After All Number Remove From List :" + number);
    }

}
