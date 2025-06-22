public class IncrementDecrement {
    public static void main(String[] args) {
        int x=25;
        int y;
        y=++x;
        System.out.println("Pre Increment is:"+y);
        y=x++;
        System.out.println("Post Increment is:"+y);
        y=--x;
        System.out.println("Pre Decrement is:"+y);
        y=x--;
        System.out.println("Post Decrement is:"+y);

    }

}
