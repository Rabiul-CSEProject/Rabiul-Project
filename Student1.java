package Static_Keyword;

public class Student1 {
    static int count = 0;

    Student1() {
        count++; // count =1
    }

    void totalStudent() {
        System.out.println("Total Student: " + count);
    }

}
