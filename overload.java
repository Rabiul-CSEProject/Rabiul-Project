package Method_Overloading;

public class overload {
    // void add(int a, int b) {
    // System.out.println(a + b);
    // }
    // ?if int value not find then its automatic converted on double

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add() {
        System.out.println("Nothing to Add");
    }

}
