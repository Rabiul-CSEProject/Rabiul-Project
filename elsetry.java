import java.util.Scanner;
public class elsetry {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            System.out.println("Enter Your Number:");
            number=input.nextInt();
            if(number%2==0){
                System.out.println("Odd");
            }
            //else if(number>20){
            //    System.out.println("Not Recommended");
            //}
            else
            System.out.println(" Even");
        }
    }

}
