package Inheritance;

public class teacher extends person {
    String subject;

    void displayInformation2() {
        displayInformation1(); // Call the method from the parent class
        System.out.println("Subject: " + subject);
    }

}
