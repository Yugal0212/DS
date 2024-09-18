import java.util.Scanner;

public class LAB_1_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter numbers of days:=");
        int days = sc.nextInt();

        int week=0;
        int year=0;

        while (days >= 365) {
            days=days-365;
            year++;
        }
        while (days>=7) {
            days=days-7;
            week++;
        }

        System.out.println(year+":"+week+":"+days);

    }
}
