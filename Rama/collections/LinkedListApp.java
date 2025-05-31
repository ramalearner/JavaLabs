package collections;

public class LinkedListApp {
    private LinkedListNode head;

    public void addNode(String s) {
        if (head == null) {
            head = new LinkedListNode(s);
        } else {
            LinkedListNode node = new LinkedListNode(s);
            node.next = head;
            head = node;
        }
    }

    public LinkedListNode getNthNode(int n) {
        if (head == null) {
            return null;
        }
        LinkedListNode temp = head;

        for (int i=1; i<n; i++) {
            if (temp.next == null) {
                return null;
            }
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String []args) {

    }
}
