
//Read two matrices, first 3x2 and second 2x3, perform multiplication operation 
// and store result in third matrix and print it.
import java.util.Scanner;

public class Lab5_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][2];
        int b[][] = new int[2][3];
        int c[][] = new int[3][3];

        System.out.println("Enter the elements of a :-");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();

            }

        }
        System.out.println("Enter the elements of b :-");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("multiplication of matrix is :-");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.println("multiplication is [" + i + "][" + j + "]:" + c[i][j]);

            }
        }

    }
}
