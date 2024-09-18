
/**
     * This is Singly Link List Program .
     * create insert at first method
     * create insert at last method
     * create insert at order method
     * create delete method for delete a node
     * create desplay method for display list
 */
import java.util.Scanner;

class SinglyLinkList {
    class Node {
        int info;
        Node link;

        Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtFirst(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            return;
        }
        newnode.link = first;
        first = newnode;
    }

    public void insertAtLast(int data) {
        Node newnode = new Node(data);
        if (first == null) {
            first = newnode;
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newnode;
    }

    public void inSertAtOrder(int data) {
        Node newnode = new Node(data);
        if (first == null || newnode.info <= first.info) {
            newnode.link = first;
            first = newnode;
            return;
        }
        Node save = first;
        while (save.link != null && newnode.info >= save.link.info) {
            save = save.link;
        }
        newnode.link = save.link;
        save.link = newnode;
    }

    public void deleteNode(int element) {
        if (first == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = first, prev = null;
        if (temp.info == element) {
            first = temp.link;
            return;
        }
        while (temp != null && temp.info != element) {
            prev = temp;
            temp = temp.link;
        }
        if (temp == null) {
            System.out.println("Node not found");
            return;
        }
        prev.link = temp.link;
    }

    public void Display() {
        Node save = first;
        while (save != null) {
            System.out.println(save.info);
            System.out.println("--------------------------");
            save = save.link;
        }
    }
}

class Lab10_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkList sll = new SinglyLinkList();
        while (true) {
            System.out.println("1.Insert At First");
            System.out.println("2.Insert At Last");
            System.out.println("3.Insert At Order");
            System.out.println("4.Delete Node");
            System.out.println("5.Exit");
            int choise = sc.nextInt();
            System.out.println("--------------------------");
            switch (choise) {
                case 1:
                    System.out.print("Enter Data:");
                    int Data1 = sc.nextInt();
                    sll.insertAtFirst(Data1);
                    sll.Display();
                    break;
                case 2:
                    System.out.print("Enter Data:");
                    int Data2 = sc.nextInt();
                    sll.insertAtLast(Data2);
                    sll.Display();
                    break;
                case 3:
                    System.out.print("Enter Data:");
                    int Data3 = sc.nextInt();
                    sll.inSertAtOrder(Data3);
                    sll.Display();
                    break;
                case 4:
                    System.out.print("Enter Data:");
                    int Data4 = sc.nextInt();
                    sll.deleteNode(Data4);
                    sll.Display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter Valid Number");
                    break;
            }
        }
    }
}