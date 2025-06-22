package Static_Keyword;

public class Student {
    String name;
    int id;
    static String UniversityName = "Dhaka university of engineering and technology";// static variable

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("University Name: " + UniversityName);
    }

}
