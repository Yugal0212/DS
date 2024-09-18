import java.util.Scanner;
import java.util.Arrays;
class Lab5_32{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string=");
        String a=sc.next();
        System.out.print("Enter second string=");
        String b=sc.next();
        char arr1[]=new char[a.length()];
        char arr2[]=new char[b.length()];
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            arr1[i]=c;
        }
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            arr2[i]=c;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<a.length();i++){
            if(arr1[i]==arr2[i]){
                    count++;
            }
        }
        if(count==a.length()){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}