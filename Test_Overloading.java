public class Test_Overloading {
    public static void main(String[] args) {
        Teacher_Overloading Teacher_Overloading1 = new Teacher_Overloading();
        Teacher_Overloading1.displayInformation();
        Teacher_Overloading Teacher_Overloading2 = new Teacher_Overloading("Rabi", "Male");
        Teacher_Overloading2.displayInformation();
        Teacher_Overloading Teacher_Overloading3 = new Teacher_Overloading("Rabiul Islam", "Male", 1796142086);
        Teacher_Overloading3.displayInformation();

    }

}
