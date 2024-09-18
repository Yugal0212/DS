//5.factor using recursion :-

import java.util.Scanner;

    public static fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }


public class Lab1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:-");
        int a = sc.nextInt();

    }

}
