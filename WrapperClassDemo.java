public class WrapperClassDemo {
    public static void main(String[] args) {
        // info: Premitive --> object
        // int x = 25;
        // @SuppressWarnings("UnnecessaryBoxing")
        // Integer y = Integer.valueOf(x);
        // System.out.println("Y ="+y);

        // Integer z = x;//info: Integer.valueOf(); this is Autoboxing
        // System.out.println("Z ="+z);
        // info: Object --> Premitive
        @SuppressWarnings("removal")
        Double d = new Double(23.5);
        System.out.println("d =" + d);

        double e = d.doubleValue();// info: this is unboxing ,valu details
        System.out.println("e =" + e);

    }

}
