// 16. Write a program to find position of the smallest number & the largest
// number
// from given n numbers.

import java.util.Scanner;

public class Lab3_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array:=");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element of array=");
            arr[i] = sc.nextInt();
        }
        int minimum = arr[0];
        int maximum = arr[0];
        int min = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
                min = i + 1;
            }
            if (arr[i] > maximum) {
                maximum = arr[i];
                max = i + 1;
            }
        }

        System.out.println("the lowest element is at " + min + "th index.");
        System.out.println("the highest element is at " + max + "th index.");

    }
}