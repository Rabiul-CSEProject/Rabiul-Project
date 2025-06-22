package StaticMethod;

public class StaticTest {
    public static void main(String[] args) {
        // you can't call any none static class on static method
        StaticMethod ob1 = new StaticMethod();// if method is none static then create object
        ob1.display1();
        StaticMethod.display2();// if object is static then method name is useable
    }

}
