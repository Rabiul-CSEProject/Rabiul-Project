public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 32;
        @SuppressWarnings("unused")
        int b = 12;
        int c;
        // c=a&b;
        // System.out.println("a&b="+c);
        c = a >> 3;
        System.out.println("a>>b=" + c);
        c = a << 3;
        System.out.println("a<<b=" + c);

    }

}
