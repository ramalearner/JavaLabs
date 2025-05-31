package exceptions;

public class MathClass {
    public static void main(String []args) {

        int a = 10, b = 10;

        try {
            int c = a / b;
            System.out.println(c);

            int [] elements = new int[5];
            elements[5] = 100;
            for(int x:elements) {
                System.out.println(x);
            }
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("An Exception occurred and cause=" + ex.getCause());
            System.out.println("An Exception occurred and message=" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("Nothing much to do at the moment as a cleanup");
        }

        System.out.println("After the finally");
        // something something
    }
}
