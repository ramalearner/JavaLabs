//package interfaces;
//
//public class FixedSizeStack implements StackInterface,TestInterface {
//    // Stack works on the principle of Last In First Out (LIFO) (FILO)
//    // If you have a stack that take max of 100 elements,
//    // for first push, you insert the element at position 0
//    // for second push, you insert the element at position 1
//    // for third push, you insert the element at position 2, and on
//    // for first pop, it will remove the element from position 2 and return
//    // for second pop, it will remove the element from position 1 and return
//    // for third pop, it will remove the element from position 0 and return
//    private int [] stack;
//    private int top = -1;
//
//    public FixedSizeStack(int size) {
//        stack = new int[size];
//    }
//
//    public void test() {
//
//    }
//
//    // Insert element on the top of the stack and increase top pointer
//    public void push(int x) {
//        // Returns value and then increments. ++top = increments first and then returns value
//        stack[++top] = x;
//    }
//    // Remove and return the element from top of the stack and decrease the top pointer
//    public T pop() throws Exception {
//        if (top == -1) {
//            throw new Exception("Empty stack cannot be run with pop()");
//        }
//        return stack[top--];
//    }
//
//    public void clear() throws Exception {
//        while (top != -1) {
//            pop();
//        }
//    }
//    // Return size of the stack
//    public int size() {
//        return top;
//    }
//
//    // Return the value of the top of the stack
//    public int peek() {
//        return stack[top];
//    }
//
//    public static void main(String []args) {
//        FixedSizeStack fs = new FixedSizeStack(200);
//        fs.push(10);
//        fs.push(20);
//        fs.push(30);
//        fs.push(40);
//
//        System.out.println(fs.peek());
//        try {
//            fs.pop();
//            fs.pop();
//
//            System.out.println(fs.peek());
//            fs.clear();
//        } catch(Exception ex) {
//            System.out.println("Received an exception while calling pop  / clear");
//            ex.printStackTrace();
//        }
//        System.out.println(fs.peek());
//    }
//}
