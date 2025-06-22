public class Stringdemo1 {
    public static void main(String[] args) {
        String FirstName = "Rabiul ";
        String LastName = "Islam";

        String FullName = FirstName.concat(LastName);
        System.out.println("Name :" + FullName);
        // Upper letter converter
        String Upperletter = FullName.toUpperCase();
        System.out.println(Upperletter);
        // lower letter converter

        String Lowerletter = FullName.toLowerCase();
        System.out.println(Lowerletter);

        // start with letter check

        boolean n = FullName.startsWith("R");
        System.out.println(n);

        // Last word check

        boolean n1 = LastName.endsWith("m");
        System.out.println(n1);

        String[] Names = { "Rabi", "Rashed", "Rahman" };
        // for (String x: Names) {
        // System.out.println(x);
        //
        // }

        for (int i = 0; i < 3; i++) {
            System.out.println(Names[i]);

        }
    }

}
