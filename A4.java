import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
       try( Scanner input=new Scanner(System.in)){
        int price=1800;
        int numberofinsatallments,monthlyinstallments;
        System.out.print("Number Of Installments:");
        numberofinsatallments=input.nextInt();
        monthlyinstallments=price/numberofinsatallments;
        System.out.print("monthly installments amount:"+monthlyinstallments+"Euro");

       }

    }

}
