
public class PalindromeDem {
    public static void main(String[] args) {
        String m = "121";
        StringBuffer o = new StringBuffer(m);
        String n = o.reverse().toString();

        if (m.equals(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
