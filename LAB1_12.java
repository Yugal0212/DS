import java.util.Scanner;

public class LAB_1_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:=");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        n = temp;
        int sum = 0;

        while (n != 0) {

            int t = 1;
            int rem;
            rem = n % 10;
            for (int i = 1; i <= count; i++) {
                t = t * rem;
            }
            sum = sum + t;
            n = n / 10;
        }
        System.out.println(sum);
    }

}