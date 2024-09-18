class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Lab12_68 {
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

    public void swapConsecutiveNodes() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node current = head;
        head = current.next;
        while (current != null && current.next != null) {
            Node next = current.next;
            current.next = next.next;
            next.next = current;

            if (prev != null) {
                prev.next = next;
            }
            prev = current;
            current = current.next;
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
        Lab12_68 list = new Lab12_68();

        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int value : values) {
            list.addNode(value);
        }

        System.out.println("Original List:");
        list.display();

        list.swapConsecutiveNodes();

        System.out.println("List after swapping consecutive nodes:");
        list.display();
    }
}
