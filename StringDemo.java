public class StringDemo {
    public static void main(String[] args) {
        String n1 = "Rabiul Islam";
        String n2 = new String("rabiul Islam");
        // char value input
        // char[] n3={'R','a','b','i'};

        System.out.println("n1 =" + n1);

        System.out.println("n2 =" + n2);

        // System.out.println(n3);
        int len = n1.length();
        System.out.println("Length of n1=" + len);

        // if (n1.equalsIgnoreCase(n2)) {
        // System.out.println("Equals");
        // } else {
        // System.out.println("Not Equals");
        // }
        boolean con = n1.contains("ami");
        System.out.println("Conatains:" + con);

        boolean b = n1.isEmpty();
        System.out.println("b=" + b);

    }

}
