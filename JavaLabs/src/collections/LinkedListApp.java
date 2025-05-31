package collections;

public class LinkedListDemo {
    private LinkedListNode head;



    public static void main(String []args) {
        LinkedListNode node2 = new LinkedListNode("Teja");
        LinkedListNode node3 = new LinkedListNode("Pandu");
        LinkedListNode node4 = new LinkedListNode("Usha");
        LinkedListNode node5 = new LinkedListNode("Amrutha");

        LinkedListNode head = new LinkedListNode("Rama");
        head.addNode(node2);
    }
}
