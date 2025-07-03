package interfaces;

public interface StackInterface<T> {
    void push(T x); // Insert element on the top of the stack and increase top pointer

    T pop() throws Exception; // Remove and return the element from top of the stack and decrease the top pointer

    int size(); // Return size of the stack

    T peek(); // Return the value of the top of the stack

    // Add a default method that pops N elements
//    default T [] popNElements(T n) {
//        int [] elements = new int[n];
//        try {
//            for (int i = 0; i < n; i++) {
//                elements[i] = pop();
//            }
//        } catch(Exception ex) {
//            System.out.println("Received exception while handling pops");
//        }
//        return elements;
//    }

    // Add a private method that gets N elements
//    private int [] getNElements(int n) {
//        System.out.println("You cannot get N elements from a stack unless you want to pop them");
//        int [] topElem = new int[1];
//        topElem[0] = pop();
//        return topElem;
//    }

    default void clear() throws Exception {
        System.out.println("clear operation not supported");
        clear2();
    }

    static void printSomething() {
        System.out.println("Lets have fun");
    }

    private void clear2() {
        System.out.println("Are you sure you dont want to support clear?");
    }



}
