package JavaBook;

public class StringDemo2 {
    public static void main(String[] args) {
        String country = "Bangladesh";
        System.out.println(country);

        char ch = country.charAt(0);
        System.out.println(ch);

        int value = country.codePointAt(0);
        System.out.println(value);

        int pos = country.indexOf('n');
        System.out.println(pos);

        pos = country.lastIndexOf('n');
        System.out.println(pos);
    }

}
