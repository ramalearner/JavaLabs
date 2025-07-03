package interfaces;

import java.util.ArrayList;

// Object
public class GenericDynamicStack<T> extends TempClass implements StackInterface<T>  {
    // Stack works on the principle of Last In First Out (LIFO) (FILO)
    // If you have a stack that take max of 100 elements,
    // for first push, you insert the element at position 0
    // for second push, you insert the element at position 1
    // for third push, you insert the element at position 2, and on
    // for first pop, it will remove the element from position 2 and return
    // for second pop, it will remove the element from position 1 and return
    // for third pop, it will remove the element from position 0 and return
    private ArrayList<T> stack;
    private int top = -1;

    public GenericDynamicStack(int size) {
        stack = new ArrayList<T>(size);
    }

    // Insert element on the top of the stack and increase top pointer
    public void push(T x) {
        // Returns value and then increments. ++top = increments first and then returns value
        top++;
        stack.add(x);
    }
    // Remove and return the element from top of the stack and decrease the top pointer
    public T pop() {
        top--;
        return stack.get(top);
    }

    // Return size of the stack
    public int size() {
        return top;
    }

    // Return the value of the top of the stack
    public T peek() {
        return stack.get(top);
    }

    private void print() {

    }

    public static void main(String []args) {
//        StackInterface fs = new FixedSizeStack(200);
//        fs.push(10);
//        fs.push(20);
//        fs.push(30);
//        fs.push(40);
//
//        System.out.println(fs.peek());
//        System.out.println(fs.getClass());
//        fs.pop();
//        fs.pop();

//        System.out.println(fs.peek());
        StackInterface<Integer> fs = new GenericDynamicStack(100);
        StackInterface.printSomething();
        // A is base class, B is derived class
//        A a1 = new B(); // This is OK
//        B b1 = new A(); // This is ERROR
    }
}
