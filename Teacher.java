public class Teacher {
    String Name, Gender;
    int Phone;
    Teacher(){
        System.out.println("No Value");
    }

    Teacher(String a, String b, int c) {
        Name = a;
        Gender = b;
        Phone = c;
    }
    // info:Parameterized Method

    // void setInformation(String n,String m,int ph){
    // Name=n;
    // Gender=m;
    // Phone=ph;
    // }

    // info:Normal Method
    void displayInformation() {
        System.out.println("Name:" + Name);
        System.out.println("Gender:" + Gender);
        System.out.println("Phone:" + Phone);
        System.out.println();

    }

}
