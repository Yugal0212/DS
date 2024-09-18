import java.util.Scanner;
 class Node{
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Lab15_83 {
    Node root;

    public int findMin() {
        Node current = root;
        if (current == null) {
            System.out.println("Tree is empty");
        }
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMax() {
        Node current = root;
        if (current == null) {
            System.out.println("Tree is empty");
        }
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Lab15_83 bst = new Lab15_83();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);
        bst.insert(12);
        bst.insert(20);

        System.out.println("Smallest element: " + bst.findMin());
        System.out.println("Largest element: " + bst.findMax());
    }
}


