import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a linked-List Operation, Press -1 to exit from the operations");
        System.out.println("1. Element addition  2. Element removal  3. display  4.Reversal");
        int n = sc.nextInt();
        Node head = null;
        while (n != -1) {
            switch (n) {
                case 1:
                    head = addition(sc, head);
                    break;
                case 2:
                    head = removal(sc, head);
                    break;
                case 3:
                    display(head);
                    break;
                case 4:
                    head = reverse(head);
                    break;
            }
            System.out.println("operation successfull.");
            System.out.println("1. Element addition  2. Element removal  3. display  4.Reversal");
            System.out.println("Press -1 to exit from the operations");
            n = sc.nextInt();
        }
        sc.close();
    }

    static Node addition(Scanner sc, Node head) {
        System.out.println("enter the value to add :");
        int val = sc.nextInt();
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(val);
        }
        return head;

    }

    static Node removal(Scanner sc, Node head) {
        if (head == null) {
            System.out.println("linked-list is empty");
            return head;
        }
        System.out.println("enter the value to be removed:");
        int n = sc.nextInt();
        if (head.data == n) {
            head = head.next;
            return head;
        } else {
            Node cur = head;
            while (cur.next != null && cur.next.data != n) {
                cur = cur.next;
            }
            if (cur.next != null) {
                cur.next = cur.next.next;
            } else {
                System.out.println("value not found in the list");
            }
        }

        return head;
    }

    static void display(Node head) {
        Node cur = head;
        System.out.println();
        while (cur != null) {
            System.out.print(cur.data + "-->");
            cur = cur.next;
        }
        System.out.println();

    }

    static Node reverse(Node head) {
        Node prev = null;
        Node cur = head;
        while (cur.next != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        head = prev;
        return head;

    }

}

class Node {
    int data;
    Node next;

    public Node(int n) {
        this.data = n;
    }
}
