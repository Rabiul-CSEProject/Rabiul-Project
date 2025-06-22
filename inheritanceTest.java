package Inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        teacher t = new teacher();
        t.name = "Rabiul Islam";
        t.age = 19;
        t.subject = "Java Programming";
        t.displayInformation2(); // Call the method from the child class
        teacher t2 = new teacher();
        t2.name = "Rahim Uddin";
        t2.age = 20;
        t2.subject = "Python Programming";
        t2.displayInformation2(); // Call the method from the child class
    }

}
