import java.util.Scanner;

public class LAB_1_11 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);


        System.out.println("enter a number:=");
        int n=sc.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum=sum+j;
            }
        }
        System.out.println(sum);
    }
}
