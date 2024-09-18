class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Lab13_73 {
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
            newNode.prev = current;
        }
    }

    public void deleteAlternateNodes() {
        if (head == null) {
            return;
        }

        Node current = head;
        boolean deleteFlag = false;

        while (current != null) {
            if (deleteFlag) {

                Node temp = current;
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                current = current.next;
            } else {
                current = current.next;
            }
            deleteFlag = !deleteFlag;
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
        Lab13_73 dll = new Lab13_73();

        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int value : values) {
            dll.addNode(value);
        }

        System.out.println("Original List:");
        dll.display();

        dll.deleteAlternateNodes();

        System.out.println("List after deleting alternate nodes:");
        dll.display();
    }
}
