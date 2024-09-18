public class Lab12_64 {
    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node first = null;

    void InsertAtlast(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            first = newNode;
            return;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newNode;
        }
    }

    void ReversList() {
        Node save = first.link;
        first.link = null;
        Node temp;
        while (save != null) {
            temp = save;
            save = save.link;
            temp.link = first;
            first = temp;
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
        Lab12_64 l = new Lab12_64();
        l.InsertAtlast(1);
        l.InsertAtlast(2);
        l.InsertAtlast(3);
        l.InsertAtlast(4);
        l.InsertAtlast(5);
        l.InsertAtlast(6);
        l.ReversList();
        l.display();
    }
}
