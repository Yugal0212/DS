// In an array of 20 elements, arrange 15 different values, which are generated 
// randomly between 1,00,000 to 9,99,999. Use hash function to generate key and 
// linear probing to avoid collision. H(x) = (x mod 18) + 2. Write a program to input 
// and display the final values of array.

import java.util.Random;

public class Lab17_88 {
    private int[] table;
    private int size;

    public Lab17_88(int size) {
        this.size = size;
        this.table = new int[size];
        for (int i = 0; i < size; i++) {
            table[i] = -1; 
        }
    }

    public void insert(int value) {
        int key = hashFunction(value);
        if (table[key] == -1) {
            table[key] = value;
        } else {
           
            int probe = 1;
            while (true) {
                int newIndex = (key + probe) % size;
                if (table[newIndex] == -1) {
                    table[newIndex] = value;
                    break;
                }
                probe++;
            }
        }
    }

    public void displayTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            if (table[i] != -1) {
                System.out.println(table[i]);
            } else {
                System.out.println("Empty");
            }
        }
    }

    private int hashFunction(int value) {
        return (value % 18) + 2;
    }

    public static void main(String[] args) {
       Lab17_88 hashTable = new Lab17_88(20);
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            int randomValue = random.nextInt(999999 - 100000 + 1) + 100000;
            hashTable.insert(randomValue);
        }

        hashTable.displayTable();
    }
}