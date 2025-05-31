package shapes;

public class Square extends Rectangle {

    // Changing the definiton of same method in derived class => Overriding
    int perimeter() {
        return 4*(length2);
    }

    // Overriding area() of the base class
    int area() {
        return length2*width2;
    }

    public static void main(String []args) {
        Rectangle r = new Rectangle(10,20);
        Square s = new Square();

        Rectangle r2 = new Square(); // You can assign a derived object to a base object
//        Square s2 = new Rectangle(); // You cannot assign a base object to derived object

        System.out.println(r.area());
//        System.out.println(r.perimeter());
        Rectangle.print();

        s.length2 = 15;
        s.width2 = 10;

        tripleTheSquaure(s);
        System.out.println(s.length2);
        System.out.println(s.width2);
        System.out.println(s.area());
        int x = 15;
        incByN(x, 100);
        System.out.println(x);
    }

    private static void incByN(int x, int N) {
        x = x + N;
        int y = x + 50;
        System.out.println(y);
    }

    public static void doubleTheSquare(Square s) {
        s.length2 *= 2;
        s.width2 *= 2;
    }

    public static void tripleTheSquaure(Square s) {
        s.length2 *= 3;
        s.width2 *= 3;
    }
}
