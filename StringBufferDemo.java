public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer b = new StringBuffer("Rabiul Islam");
        System.out.println(b);
        b.append(" Rabi\n");
        b.append("Roll : 610811");
        System.out.println(b);

        // b.reverse();
        // System.out.println(b);
        // b.delete(0, 5);
        // System.out.println(b);
        b.setLength(12);
        System.out.println(b);

    }

}
