public class StringD1 {
    public static void main(String[] args) {
        String n1 = "Bangladesh is a greatest country";
        System.out.println(n1);

        String n2 = n1.replace('a', 'A');
        System.out.println(n2);
        // info: split checking program
        String[] n3 = n1.split(" ");

        for (String x : n3) {
            System.out.println(x);
        }
    }

}
