import java.util.Scanner;
public class PrimeDemo {
    public static void main(String[] args) {
        try(Scanner input=new Scanner(System.in)){
        int count=0;
        System.out.println("Enter Your Variable:");
        int num =input.nextInt();
        if (num==0 || num==1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < num/2; i++) {
                if (num%i==0) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.print("prime number");
            }else{
                System.out.print("Not a prime");
            }
        }
            
        }
    }
}
