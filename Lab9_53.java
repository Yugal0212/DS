
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Lab9_53 {
    private int[] queue;
    private int size;
    private int capacity;

    public Lab9_53(int var1) {
        this.capacity = var1;
        this.queue = new int[var1];
        this.size = 0;
    }

    public void insert(int var1) {
        if (this.size == this.capacity) {
            System.out.println("Priority Queue is full. Cannot insert.");
        } else {
            int var2;
            for (var2 = this.size - 1; var2 >= 0 && this.queue[var2] < var1; --var2) {
                this.queue[var2 + 1] = this.queue[var2];
            }

            this.queue[var2 + 1] = var1;
            ++this.size;
        }
    }

    public void delete() {
        if (this.size == 0) {
            System.out.println("Priority Queue is empty. Cannot delete.");
        } else {
            System.out.println("Deleted element: " + this.queue[0]);

            for (int var1 = 0; var1 < this.size - 1; ++var1) {
                this.queue[var1] = this.queue[var1 + 1];
            }

            --this.size;
        }
    }

    public void display() {
        if (this.size == 0) {
            System.out.println("Priority Queue is empty.");
        } else {
            System.out.println("Priority Queue elements:");

            for (int var1 = 0; var1 < this.size; ++var1) {
                int var10001 = this.queue[var1];
                System.out.print("" + var10001 + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the capacity of the priority queue: ");
        int var2 = var1.nextInt();
        Lab9_53 var3 = new Lab9_53(var2);

        while (true) {
            System.out.println("\nPriority Queue Operations:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an operation: ");
            int var4 = var1.nextInt();
            switch (var4) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    int var5 = var1.nextInt();
                    var3.insert(var5);
                    break;
                case 2:
                    var3.delete();
                    break;
                case 3:
                    var3.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    var1.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
