
//22. Write a program to delete a number from a given location in an array.
import java.util.Scanner;

public class Lab4_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array:=");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr2[] = new int[n - 1];

        for (int i = 0; i < n; i++) {
            System.out.print("enter element of array:=");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter index :=");
        int index = sc.nextInt();

        if (index < 0 || index > n) {
            System.out.println("invalid index");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            if (i < index) {
                arr2[i] = arr[i];
            }

            else {
                arr2[i] = arr[i + 1];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
