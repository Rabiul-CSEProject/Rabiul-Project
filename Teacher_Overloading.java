public class Teacher_Overloading {
    String Name, Gender;
    int Phone;

    Teacher_Overloading() {
        System.out.println("No Information");
        System.out.println();

    }

    Teacher_Overloading(String n, String g) {
        Name = n;
        Gender = g;

    }

    // constructor name= class name but method name != class name
    Teacher_Overloading(String n, String g, int p) {
        Name = n;
        Gender = g;
        Phone = p;

    }

    void displayInformation() {
        System.out.println("Name : " + Name);
        System.out.println("Gender : " + Gender);
        System.out.println("Phone : " + Phone);
        System.out.println();
    }

}
