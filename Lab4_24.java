//Write a program to delete a number from an array that is already sorted in an 
// ascending order.

import java.util.Scanner;

public class Lab4_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n - 1];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter value of  arr[" + i + "] : ");
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter number you want to delete : ");
		int num = sc.nextInt();
		int j = 0;
		for (int i = 0; i < arr2.length; i++, j++) {
			if (arr1[i] == num) {
				arr2[i] = arr1[i + 1];
				j--;
			} else {
				arr2[i] = arr1[j];
			}
		}
		System.out.println("After deletion : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Value of arr[" + i + "] : " + arr2[i]);
		}
	}
}