import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Lab12_67 {
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

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void insertGCDNodes() {
        Node current = head;
        while (current != null && current.next != null) {
            int gcdValue = gcd(current.data, current.next.data);
            Node gcdNode = new Node(gcdValue);

            gcdNode.next = current.next;
            current.next = gcdNode;

            current = gcdNode.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab12_67 list = new Lab12_67();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int numNodes = scanner.nextInt();
        for (int i = 0; i < numNodes; i++) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            list.addNode(data);
        }

        System.out.println("Original list:");
        list.display();

        list.insertGCDNodes();

        System.out.println("List after inserting GCD nodes:");
        list.display();

        scanner.close();
    }
}
