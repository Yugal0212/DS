//. Read two 2x2 matrices and perform addition of matrices into third matrix and 
// print it

import java.util.Scanner;

public class Lab5_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        System.out.println("Enter the elements of a :-");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();

            }

        }
        System.out.println("Enter the elements of b :-");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("sum of matrix is :-");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println("sum is [" + i + "][" + j + "]:" + c[i][j]);
            }

        }

    }
}
