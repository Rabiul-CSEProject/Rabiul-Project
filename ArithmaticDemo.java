
//public class ArithmaticDemo {
//    public static void main(String[] args) {
//        int num1,num2,result;
//        num1=30;
//        num2=10;
//        result=num1+num2;
//        System.out.print("Sum="+result);
//        result=num1-num2;
//        System.out.println("Sub="+result);
//        result=num1*num2;
//        System.out.println("multi="+result);
//        result=num1/num2;
//        System.out.println("Dev="+result);
//        result=num1%num2;
//        System.out.println("Rem="+result);
//    }
//
//}
import java.util.Scanner;

public class ArithmaticDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter Your First Number:");
        num1 = input.nextInt();
        System.out.println("Enter Your Second Number:");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.print("Sum =" + result);
        result = num1 - num2;
        System.out.println("Sub =" + result);
        result = num1 * num2;
        System.out.println("multi =" + result);
        double result2 = (double) num1 / num2;
        System.out.println("Dev =" + result2);
        result = num1 % num2;
        System.out.println("Rem =" + result);

    }
}