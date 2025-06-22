package OOP;

public class StaticBlock {
    static int id;
    static String name;

    static {
        id = 100;
        name = "Md Rabiul Islam";
    }

    // info: static block previous subject of main method
    static void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        StaticBlock.display();
    }

}
