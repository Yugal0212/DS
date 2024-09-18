public class Lab11_60 {
    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node first = null;

    void push(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            newNode.link = first;
            first = newNode;
        }
    }

    void pop() {
        if (first == null) {
            System.out.println("Node is empty");
        } else {
            first = first.link;
        }
    }

    void display() {
        Node save = first;
        while (save != null) {
            System.out.print(save.info + " ");
            save = save.link;

        }
    }

    public static void main(String[] args) {
        Lab11_60 l = new Lab11_60();

        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.display();
        System.out.println();
        l.pop();
        l.pop();
        l.display();
    }
}