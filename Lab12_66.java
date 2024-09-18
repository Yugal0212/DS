
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class Lab12_66 {
    Node head;

    Lab12_66() {
    }

    public void addNode(int var1) {
        Node var2 = new Node(var1);
        if (this.head == null) {
            this.head = var2;
        } else {
            Node var3;
            for (var3 = this.head; var3.next != null; var3 = var3.next) {
            }

            var3.next = var2;
        }

    }

    public int getLength() {
        Node var1 = this.head;

        int var2;
        for (var2 = 0; var1 != null; var1 = var1.next) {
            ++var2;
        }

        return var2;
    }

    public void swapKthNode(int var1) {
        int var2 = this.getLength();
        if (var1 <= var2 && var1 > 0) {
            Node var3 = this.head;

            for (int var4 = 1; var4 < var1; ++var4) {
                var3 = var3.next;
            }

            Node var6 = this.head;

            int var5;
            for (var5 = 1; var5 < var2 - var1 + 1; ++var5) {
                var6 = var6.next;
            }

            var5 = var3.data;
            var3.data = var6.data;
            var6.data = var5;
            System.out.println("Swapped Kth node from beginning with Kth node from end.");
        } else {
            System.out.println("Invalid value of K.");
        }
    }

    public void display() {
        for (Node var1 = this.head; var1 != null; var1 = var1.next) {
            System.out.print(var1.data + " ");
        }

        System.out.println();
    }

    public static void main(String[] var0) {
        Lab12_66 var1 = new Lab12_66();
        Scanner var2 = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int var3 = var2.nextInt();

        int var4;
        for (var4 = 0; var4 < var3; ++var4) {
            System.out.print("Enter data for node " + (var4 + 1) + ": ");
            int var5 = var2.nextInt();
            var1.addNode(var5);
        }

        System.out.print("Enter the value of K: ");
        var4 = var2.nextInt();
        System.out.println("Original list:");
        var1.display();
        var1.swapKthNode(var4);
        System.out.println("List after swapping:");
        var1.display();
        var2.close();
    }
}
