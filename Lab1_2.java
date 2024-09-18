//2.odd even number:-

import java.util.Scanner;

public class Lab1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num :-");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("number is odd");
        } else {
            System.out.println("number is even");
        }
    }
}
