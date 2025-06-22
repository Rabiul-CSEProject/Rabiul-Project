package JavaBook;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        // int day,month;
        // System.out.print("Enter Your Day:");
        // int day=input.nextInt();//For day to month
        // month=day*30;
        // System.out.println("One Month Equal Is:"+month);
        // int month=day/30;
        // int newDay=day-(month*30);
        // System.out.println( day +" day is equal to "+ month + "month and" + newDay+"
        // day ");
        // System.out.print("Enter a month:");//for month to day
        // int month=input.nextInt();
        // int day=month*30;
        // System.out.print(month+"month is equal to"+day+"day");
        // System.out.println("Enter hour:");//For Hour to Minute Convert
        // int hour=input.nextInt();
        // int minute=hour*60;
        // System.out.print(hour+"hour is equal to"+minute+"minute");
        // System.out.print("Enter minute:");//For Hour to Minute Convert
        // int minute=input.nextInt();
        // int hour=minute/60;
        // int newMinute=minute-(hour*60);
        // System.out.print(minute+"minute is equal to"+hour+"hour
        // and"+newMinute+"minute..");
        // System.out.print("Enter hour:");//For Hour to Second Convert
        // int hour=input.nextInt();
        // int second=hour*60*60;
        // System.out.print(hour+" hour is equal to "+second+" second ");
        System.out.print("Enter second:");// For Second to Hour Convert
        int second = input.nextInt();
        int minute = second / 60;
        int hour = minute / 60;
        int newMinute = minute - hour * 60;
        int newSecond = second - minute * 60;
        System.out.print(second + " second is equal to " + hour + " hour and " + newMinute + " minute and " + newSecond
                + " second ");
    }

}
