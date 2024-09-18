//4.factorial of a number:-

import java.util.Scanner;

public class Lab1_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 2; i < n; i++) {

            fact = fact * i;

        }
        System.out.println(+fact);
    }
}
