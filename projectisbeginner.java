import java.util.Scanner;

public class projectisbeginner {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Second");
        int second = input.nextInt();
        int minute = second / 60;
        int hour = minute / 60;
        int newminute = minute - hour * 60;
        int newSecond = second - minute * 60;
        System.out.print(
                second + "Second is equal to" + hour + "hour and" + newminute + "minute and" + newSecond + "second");
    }
}
