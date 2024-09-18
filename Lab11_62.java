//. WAP to remove duplicate elements from a singly linked list.
public class Lab11_62 {
    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node first = null;

    void insertAtLast(int info) {
        Node newnode = new Node(info);
        if (first == null) {
            first = newnode;
            return;
        } else {
            Node save = first;
            while (save.link != null) {
                save = save.link;
            }
            save.link = newnode;
        }
    }

    void Deletduplicate() {
        Node i = first;
        while (i.link != null) {
            Node j = i;
            Node pre = null;
            while (j.link != null) {
                pre = j;
                j = j.link;
                if (i.info == j.info) {
                    pre.link = j.link;
                }
            }
            i = i.link;
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
        Lab11_62 L1 = new Lab11_62();
        L1.insertAtLast(1);
        L1.insertAtLast(1);
        L1.insertAtLast(2);
        L1.insertAtLast(3);
        L1.insertAtLast(4);
        L1.insertAtLast(3);
        L1.insertAtLast(2);
        L1.Deletduplicate();
        L1.display();

    }
}
