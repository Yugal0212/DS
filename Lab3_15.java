
// 15.Write a program to calculate average of first n numbers.


import java.util.Scanner;

public class Lab3_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to find average of first n number=");
        int n = sc.nextInt();
        double total = 0;

        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        double average = total / n;
        System.out.println("total is :-" + total);
        System.out.println("average is :-" + average);
    }
}
