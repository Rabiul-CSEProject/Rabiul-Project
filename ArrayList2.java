import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        ArrayList<Integer> number3 = new ArrayList<Integer>();
        number1.add(20);
        number1.add(30);
        number1.add(10);
        number1.add(40);

        System.out.println("Number 1= " + number1);
        // number 2 contains

        number2.add(30);
        number2.add(20);
        number2.add(50);
        number2.add(60);
        System.out.println("Number2 =" + number2);
        // number 3 contains
        number3.addAll(number1);

        // number3.add(25);
        // number3.add(35);
        // number3.add(45);
        // number3.add(15);
        System.out.println("Number 3=" + number3);

        // Equal method
        boolean check = number1.equals(number2);
        System.out.println("Number1 Equals Number2= " + check);
    }

}