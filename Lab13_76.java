class Node {
    int coefficient, exponent;
    Node next;

    public Node(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }
}

class Lab13_76 {
    Node head;

    // Method to add a term to the polynomial
    public void addTerm(int coefficient, int exponent) {
        Node newNode = new Node(coefficient, exponent);
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

    // Method to add two polynomials
    public static Lab13_76 addPolynomials(Lab13_76 p1, Lab13_76 p2) {
        Lab13_76 result = new Lab13_76();
        Node n1 = p1.head, n2 = p2.head;

        while (n1 != null && n2 != null) {
            if (n1.exponent == n2.exponent) {
                result.addTerm(n1.coefficient + n2.coefficient, n1.exponent);
                n1 = n1.next;
                n2 = n2.next;
            } else if (n1.exponent > n2.exponent) {
                result.addTerm(n1.coefficient, n1.exponent);
                n1 = n1.next;
            } else {
                result.addTerm(n2.coefficient, n2.exponent);
                n2 = n2.next;
            }
        }

        while (n1 != null) {
            result.addTerm(n1.coefficient, n1.exponent);
            n1 = n1.next;
        }
        while (n2 != null) {
            result.addTerm(n2.coefficient, n2.exponent);
            n2 = n2.next;
        }

        return result;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.coefficient + "x^" + current.exponent);
            if (current.next != null) {
                System.out.print(" + ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_76 p1 = new Lab13_76();
        Lab13_76 p2 = new Lab13_76();

        p1.addTerm(5, 3);
        p1.addTerm(4, 2);
        p1.addTerm(2, 0);

        p2.addTerm(3, 3);
        p2.addTerm(2, 2);
        p2.addTerm(1, 1);

        System.out.println("Polynomial 1:");
        p1.display();

        System.out.println("Polynomial 2:");
        p2.display();

        Lab13_76 result = addPolynomials(p1, p2);
        System.out.println("Result after addition:");
        result.display();
    }
}
