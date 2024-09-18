//Write a menu driven program to implement Binary Search Tree (BST) & perform 
// following operations 
//  Insert a node, Delete a node, Search a node

import java.util.Scanner;

class Binary_serch_Tree {
    class Node {
        int key;
        Node left;
        Node right;

        public Node(int data) {
            key = data;
            left = right = null;
        }
    }

    Node root = null;

    // ---------------------------------------------- insert a node----------------------------------------------
    void insert(int data) {

        root = insertRecord(root, data);
    }

    public Node insertRecord(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.key) {
            root.left = insertRecord(root.left, data);
        }

        else if (data > root.key) {
            root.right = insertRecord(root.right, data);

        }

        return root;
    }

    // ---------------------------------------------- Search a node----------------------------------------------

    boolean Search(int data) {
        return serchrecord(root, data);
    }

    public boolean serchrecord(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.key == data) {
            return true;
        }

        if (data < root.key) {
            return serchrecord(root.left, data);
        }

        return serchrecord(root.right, data);

    }

    // ---------------------------------------------- Delete a node----------------------------------------------
    void delete(int data) {
        root = deleteRecord(root, data);
    }

    public Node deleteRecord(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.key) {
            root.left = deleteRecord(root.left, data);
        }

        else if (data > root.key) {
            root.right = deleteRecord(root.right, data);
        }

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteRecord(root.right, root.key);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // ---------------------------------------- preorder,postorder,inorder--------------------------------//
    void preorder() {
        System.out.println("Preorder traversal: ");
        preorder(root);
    }

    void inorder() {
        System.out.println("Inorder traversal: ");
        inorder(root);
    }

    void postorder() {
        System.out.println("Postorder traversal: ");
        postorder(root);
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        preorder(node.left);
        preorder(node.right);

    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key + " ");
    }

}

public class Lab14_77 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_serch_Tree bst = new Binary_serch_Tree();
        int choice, item;
        while (true) {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Preorder Traversal");
            System.out.println("5. Inorder Traversal");
            System.out.println("6. Postorder Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the item to insert: ");
                    item = sc.nextInt();
                    bst.insert(item);
                    break;
                case 2:
                    System.out.print("Enter the item to delete: ");
                    item = sc.nextInt();
                    bst.delete(item);
                    break;
                case 3:
                    System.out.print("Enter the item to search: ");
                    item = sc.nextInt();
                    if (bst.Search(item))
                        System.out.println(item + " found in the tree");
                    else
                        System.out.println(item + " not found in the tree");
                    break;
                case 4:
                    System.out.println("Preorder tree is :");
                    bst.preorder();

                    break;
                case 5:
                    System.out.println("Inorder tree is :");
                    bst.inorder();

                    break;
                case 6:
                    System.out.println("Postorder tree is :");
                    bst.postorder();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
