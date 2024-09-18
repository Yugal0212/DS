
//Write a program to swap two numbers using user-defines method
import java.util.Scanner;

public class Lab6_33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();

		System.out.println("enter a  number number");
		int b = sc.nextInt();

		System.out.println("after swaping");
		int[] back = swap(a, b);
		for (int i = 0; i < back.length; i++) {
			System.out.println(back[i]);
		}
	}

	public static int[] swap(int a, int b) {
		int temp;
		int arr[] = new int[2];
		arr[0] = a;
		arr[1] = b;

		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		return arr;
	}

}
