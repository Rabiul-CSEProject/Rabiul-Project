package Inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        animal a = new animal();
        personForanimal p = new personForanimal();
        personForTeacher t = new personForTeacher();

        // You can now use the objects a, p, and t as needed
        System.out.println(a instanceof animal); // true, since a is an instance of animal
        System.out.println(p instanceof animal); // true, since personForanimal extends animal
        System.out.println(t instanceof personForanimal); // true, since personForTeacher extends personForanimal
        System.out.println(t instanceof animal); // true, since personForTeacher ultimately extends animal
        System.out.println(p instanceof personForTeacher); // false, since personForanimal does not extend
                                                           // personForTeacher
    }

}
