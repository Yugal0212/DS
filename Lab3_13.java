
//13. Write a program to read and display n numbers using an array.
import java.util.Scanner;

public class Lab3_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter  numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The numbers entered are:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}

