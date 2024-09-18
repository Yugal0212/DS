import java.util.Scanner;

// Node class for a singly linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Lab10_59 {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static boolean areIdentical(Lab10_59 list1, Lab10_59 list2) {
        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return current1 == null && current2 == null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lab10_59 list1 = new Lab10_59();
        Lab10_59 list2 = new Lab10_59();

        System.out.println("Enter the number of nodes for List 1:");
        int n1 = scanner.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter data for node " + (i + 1) + " of List 1: ");
            int data = scanner.nextInt();
            list1.addNode(data);
        }

        System.out.println("Enter the number of nodes for List 2:");
        int n2 = scanner.nextInt();
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter data for node " + (i + 1) + " of List 2: ");
            int data = scanner.nextInt();
            list2.addNode(data);
        }

        if (areIdentical(list1, list2)) {
            System.out.println("The two lists are identical.");
        } else {
            System.out.println("The two lists are not identical.");
        }

        scanner.close();
    }
}
