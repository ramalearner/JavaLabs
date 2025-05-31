package shapes;

public  class Rectangle {
    // Only the self class itself
    private int length1, width1;

    public Rectangle() {
    }

    public Rectangle(int l, int w) {
        length1 = l;
        width1 = w;
    }

     void printType() {}

    // 1. Class itself
    // 2. Sub-class in same package
    // 3. Sub-class in different package
    // 4. Non-subclass in same package
    // 5. Non-subclass in different pkg
    protected int length2, width2;

    // default
    // 1. Class itself
    // 2. Subclass in same package
    // 3. Non-Subclass in same package
    int length3, width3;
    // Everyone
    public int length4, width4;

    int area() {
        return length1 * width1;
    }



    int perimeter2() {
        return 2*(length2+width2);
    }

    // Same method name but different arguments either in number of args / type of args => Overloading
    int perimeter2(int x) {
        return 2*(length2+width2);
    }

    static void print() {
        System.out.println("Lets enjoy Java");
    }

    public static void main(String[]args) {
        // Declaration means only type is specified but not necessarily value
        // Definition means both type and value are assigned
        final int x, y = 200; // Constants // x is only declared
        int a = 10, b = 20;
        a = 1000;
        x = 2000;
    }
}
