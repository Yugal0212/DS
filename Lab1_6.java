//6.power of a number:-

import java.util.Scanner;

public class Lab1_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter a power");
        int b = sc.nextInt();
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.println("power of a number is :- " + result);
    }
}
