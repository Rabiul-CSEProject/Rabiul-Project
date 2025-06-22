package Problem_Solve;

public class Box {
    double height, width, depth; // instance variable
    // if local variable and instance variable name are same then automatically hide
    // instance variable

    Box(double h, double w, double d) {
        // (h,w,d) is local variable under instance variable
        height = h;
        width = w;
        depth = d;
    }

    void displayVol() {
        double vol = height * width * depth;
        System.out.println("Volume =" + vol);
    }

}
