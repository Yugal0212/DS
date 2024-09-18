
//8.Write a program to check whether a number is prime or not.
import java.util.*;

public class Lab1_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int prime = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = 0;
                break;
            }
        }
        if (prime == 1) {
            System.out.println("prime:");
        } else {
            System.out.println(" not prime");
        }

    }
}
