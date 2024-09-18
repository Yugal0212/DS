import java.util.Scanner;

public class LAB_1_9 {
    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);

        System.out.print("enter hour of first time:=");
        int  h1=sc.nextInt();
        System.out.print("enter min of first time:=");
        int  m1=sc.nextInt();
        System.out.print("enter second of first time:=");
        int  s1=sc.nextInt();
        System.out.print("enter hour of second time:=");
        int  h2=sc.nextInt();
        System.out.print("enter min of second time:=");
        int  m2=sc.nextInt();
        System.out.print("enter second of second time:=");
        int  s2=sc.nextInt();

        int h3=h1+h2;
        int m3=m1+m2;
        int s3=s1+s2;

        while (s3>=60) {
            s3=s3-60;
            m3++;
        }

        while (m3>=60) {
            m3=m3-60;
            h3++;
        }
     
        System.out.println(h3+":"+m3+":"+s3);
    }
}
