package Tutorial_96_problem_solviing;

public class Box {

    double height, width, depth; //instance variable

    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void displayVol() {
        double vol = height * width * depth;
        System.out.println("Volume is : " + vol);
    }

    
}
