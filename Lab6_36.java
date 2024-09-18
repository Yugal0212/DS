//Create methods to convert temperature from Celsius to Fahrenhit and vice 
// versa. Take temperature input from user and call the appropriate conversion 
// method.

import java.util.Scanner;

public class Lab6_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.convert temperature from Celsius to Fahrenhit");
        System.out.println("2.convert temperature from Fahrenhit to Celsius");
        int n = sc.nextInt();
        System.out.println("enter=");
        float ans = sc.nextFloat();

    }

    public static float convert(int n, float ans) {
        Float m;
        if (n == 1) {
            System.out.println("enter  temperature in Celsius");
            m = ((ans - 32) * 5) / 9;
            return m;

        } else {
            m = ((ans * 9) / 5) + 32;
            return m;
        }
    }
}
