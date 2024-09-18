import java.util.Scanner;
class BankAccount{
    long actno;
    int balance;
    String name,actholder;
    BankAccount(long actno,String name,String actholder,int balance){
        this.actno=actno;
        this.name=name;
        this.actholder=actholder;
        this.balance=balance;
    }
    void deposit(int d){
        if(d<0){
            System.out.println("Please Enter positive balance");
        }
        else{
            balance=balance+d;
            System.out.println("your balance="+balance);
        }
    }
    void withdraw(int w){
        if(w<0||balance<w){
            System.out.println("Negative Balance");
        }
        else{
            balance=balance-w;
            System.out.println("your balance="+balance);
        }
    }
    void check(){
        System.out.println("Account Number:"+actno);
        System.out.println("Account Name:"+name);
        System.out.println("Account Holder:"+actholder);
        System.out.println("Account Balance:"+balance);
    }
}
class Lab6_37{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("how many account you are creat=");
        int n=sc.nextInt();
        BankAccount ba[]=new BankAccount[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Account Number=");
            long ac=sc.nextLong();
            System.out.print("Enter Name=");
            String N=sc.next();
            System.out.print("Enter Account Holder=");
            String ah=sc.next();
            System.out.print("Enter Balance=");
            int B=sc.nextInt();
            ba[i]=new BankAccount(ac,N,ah,B);
            System.out.println("-------------");
            ba[i].check();
            System.out.println("*");
        }
            int ans=0;
            while (true){
                System.out.print("Enter Account no:");
                long acno=sc.nextLong();
                for(int j=0;j<n;j++){
                    if(ba[j].actno==acno){
                        ans=j;
                        break;
                    }
                }
                System.out.println("1.diposit,2.withdraw,3.check balance,4.Total Account,5.exit");
                int k=sc.nextInt();
                switch (k) {
                    case 1:
                        System.out.print("Enter Balance=");
                        int d=sc.nextInt();
                        ba[ans].deposit(d);
                        break;
                    case 2:
                        System.out.print("Enter Balance=");
                        int w=sc.nextInt();
                        ba[ans].withdraw(w);
                        break;
                    case 3:
                        ba[ans].check();
                        break;
                    case 4:
                        for(int a=0;a<n;a++){
                            ba[a].check();
                            System.out.println("");
                        }
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid no.");
                        break;
                }
            }
        
    }
}