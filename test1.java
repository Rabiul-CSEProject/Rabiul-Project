package Inheritance;

public class test1 {
    public static void main(String[] args) {
        teacher1 t = new teacher1();
        t.setName("Rabiul Islam");
        t.setAge(19);
        t.setSubject("Java Programming");
        t.displayInfo();
        // Output:
        teacher1 t1 = new teacher1();
        t1.setName("Rafiul Islam");
        t1.setAge(20);
        t1.setSubject("C++ Programming");
        t1.displayInfo();

    }

}
