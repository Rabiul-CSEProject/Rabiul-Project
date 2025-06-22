
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int RandomNumber = rand.nextInt(9) + 1; // info: Random number counting
        System.out.println(RandomNumber);

    }

}
