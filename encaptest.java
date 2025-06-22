package OOP;

public class encaptest {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name = "Rabiul Islam";
        p1.age = 19;
        p1.talk();
        p1.eat();
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        // p1.name = "Rabiul"; // This line would cause an error if name is private
    }

}
