//23.write a program to delete a number from an array that is already sorted in an 
// ascending order.

import java.util.Scanner;

public class Lab4_23 {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array:=");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr2[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.print("enter element of array:=");
            arr[i] = sc.nextInt();
        }

        System.out.println("enter a new element:=");
        int newElement = sc.nextInt();

        System.out.println();
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < newElement) {
                arr2[i] = arr[i];
            } else if (arr[i - 1] < newElement && arr[i] > newElement) {
                arr2[i] = newElement;
                temp = i;
            }
        }
        for (int i = temp + 1; i < arr2.length; i++) {
            arr2[i] = arr[i - 1];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
