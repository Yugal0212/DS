// WAP to split a circular linked list into two halves. 
public class Lab13_74 {
    class Node {
        int info;
        Node link;

        Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    Node first = null;
    Node last = null;

    void InsertAtFirst(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            first = newNode;
            last = newNode;
            first.link = first;
            return;
        } else {

            newNode.link = first;
            first = newNode;
            last.link = first;

        }
    }

    void InsertAtlast(int info) {
        Node newNode = new Node(info);
        if (first == null) {
            first = newNode;
            last = newNode;
            first.link = first;
            return;
        } else {
            last.link = newNode;
            last = newNode;
            last.link = first;
        }
    }

    void Delete(int info) {
        if (first == null) {
            System.out.println("LinkedList Underflow");
            return;
        } else {
            if (first.info == info && first == last) {
                first = null;
                last = null;
            } else if (first.info == info) {
                first = first.link;
                last.link = first;
            } else {
                Node save = first;
                Node pre = null;
                while (save != last && save.info != info) {
                    pre = save;
                    save = save.link;
                }
                pre.link = save.link;
            }
        }

    }

    void display() {
        Node save = first;
        while (save != last) {
            System.out.print(save.info + " ");
            save = save.link;
        }
        System.out.print(save.info + " "); // last node
    }

    Node frentNode;
    Node back;

    void split() {
        Node save = first;
        int count = 0;
        while (save != last) {
            count++;
            save = save.link;
        }
        count = count + 1;
        Node slow = first;
        Node fast = first;

        // Move fast pointer two steps ahead and slow pointer one step ahead
        while (fast != last && fast.link != last) {
            fast = fast.link.link;
            slow = slow.link;
        }

        // Now 'slow' points to the middle node
        frentNode = slow.link; // The second half starts from 'slow.link'
        slow.link = first; // Break the link between the two halves

        // Update 'last' and 'back'
        back = last;
        back.link = frentNode;
        last = slow;

        // Print the first half
        save = first;
        do {
            System.out.print(save.info + " ");
            save = save.link;
        } while (save != last);
        System.out.println(); // Print a newline

        // Print the second half
        save = frentNode;
        do {
            System.out.print(save.info + " ");
            save = save.link;
        } while (save != back);
        System.out.println(); // Print a newline
    }

    public static void main(String[] args) {
        Lab13_74 l = new Lab13_74();
        l.InsertAtlast(1);
        l.InsertAtlast(2);
        l.InsertAtlast(3);
        l.InsertAtlast(4);
        l.InsertAtlast(5);
        l.display();
        System.out.println();
        l.split();
    }
}
