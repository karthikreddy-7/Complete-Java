package Trees;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);
        System.out.print("In-Order traversal:");
        inorder(root);
        System.out.println();
        System.out.print("Pre-Order traversal:");
        preorder(root);
        System.out.println();
        System.out.print("Post-Order traversal:");
        postorder(root);
        int height = height(root);
        System.out.println();
        System.out.println("height of binary tree is: " + height);
        sc.close();
    }

    static Node createTree(Scanner sc) {
        System.out.println("Enter the data:");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node root = new Node(data);
        System.out.println("Enter the left of the data " + data);
        root.left = createTree(sc);
        System.out.println("Enter the right of the data " + data);
        root.right = createTree(sc);
        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + "->");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "->");
    }

    static int height(Node root) {
        if (root == null)
            return 0;
        return (Math.max(height(root.left), height(root.right)) + 1);
    }

    static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);
        if (root.data > key) {
            root.left = insert(root.left, key);
        } else if (root.data < key) {
            root.right = insert(root.right, key);
        }
        return root;
    }
}
