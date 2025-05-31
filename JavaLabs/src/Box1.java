public class Box1 {
    double weight, height, depth;

    double volume() {
        return weight*height*depth;
    }

    // constructors
    Box1(double w, double h, double d) {
        weight = w;
        height = h;
        depth = d;
    }
}

