public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Rabiul Islam");

        // str.append("Rabi");
        // str.append("23.4");
        // str.append('B');
        str.reverse();
        str.delete(2, 3);
        System.out.println(str);
    }

}
