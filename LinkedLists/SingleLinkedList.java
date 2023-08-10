package LinkedLists;

/*
 * In simple words, a linked list consists of nodes 
 * where each node contains a data field and a reference(link) to the next node in the list.
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class SingleLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(10);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);
        System.out.println(n2.next);
    }

}
