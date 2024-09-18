public class RINORDER {

    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    static void RINORDER(Node T) {

        if (T == null) {
            System.out.print("empty tree");
            return;
        }
        if (T.prev != null) {
            RINORDER(T.prev);
        }
        System.out.print(T.data+" ");
        
        if (T.next != null) {
            RINORDER(T.next);
        }
        return;
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.prev = b;
        a.next = e;
        b.next = d;
        b.prev = c;
        e.prev = f;
        e.next = g;

        RINORDER(a);
    }
}
