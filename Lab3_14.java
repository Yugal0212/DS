// 14. Write a program to calculate sum of numbers from m to n.

import java.util.Scanner;

public class Lab3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter starting number:=");
        int m = sc.nextInt();

        System.out.println("enter starting number:=");
        int n = sc.nextInt();
        int ans = 0;
        for (int i = m; i <= n; i++) {
            ans = ans + i;
        }
        System.out.println(ans);
    }
}
