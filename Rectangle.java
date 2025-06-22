package JavaBook;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        // int length,width;//For rectangle
        // System.out.print("Enter The Length:");
        // length=input.nextInt();
        // System.out.print("Enter The Widh:");
        // width=input.nextInt();
        // int rectanglearea=(length*width);//rectanfgle are law
        // System.out.println("Racangle Area Below:"+rectanglearea);

        // int d1,d2;//For Rhombos
        // System.out.print("Enter the diagonal-1:");
        // d1=input.nextInt();
        // System.out.println("Enter the diagonal-2:");
        // d2=input.nextInt();
        // double rhombos_area=0.5*(d1*d2);
        // System.out.println("Rhombos Area:"+rhombos_area);

        int length;// For Square area
        System.out.print("Enter The Length:");
        length = input.nextInt();
        double square_area = length * length;
        System.out.println("Square Area Below:" + square_area);

    }

}
