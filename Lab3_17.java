
// 17.Write a program to find whether the array contains a duplicate number or not.
import java.util.*;

public class Lab3_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of array:=");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element of array=");
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                }
            }
        }
        if (flag == true) {
            System.out.println("duplicate element not found");
        } else {
            System.out.println("duplicte element founds");
        }
    }
}
