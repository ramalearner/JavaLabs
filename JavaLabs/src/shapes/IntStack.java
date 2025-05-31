package shapes;

public interface IntStack {
    void push(int x);
    int pop();
    static void print() {
        System.out.println("Stack is one of the most commonly used interface in CS");
    }
    default int size() {
        return -1;
    }
}
