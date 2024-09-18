import java.util.Scanner;

// Node class representing each node in the circular linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Lab10_58 {
    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public int countNodes() {
        if (head == null) {
            return 0;
        }

        Node current = head;
        int count = 0;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    public static void main(String[] args) {
        Lab10_58 list = new Lab10_58();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int numNodes = scanner.nextInt();
        for (int i = 0; i < numNodes; i++) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.addNode(data);
        }

        System.out.println("Number of nodes in the circular linked list: " + list.countNodes());

        scanner.close();
    }
}
