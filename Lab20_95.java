// 95. Write a program to implement Radix Sort using Array. 
public class Lab20_95 {
    public static void main(String[] args) 
    {
        int a[]= {150,458,1,10,79,48,905,8};
        Lab20_95 s = new Lab20_95();
        int n = a.length;

        s.sort(a, n);

        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }

    void sort(int a[],int n)
    {
        int max = a[0];
        for (int i = 0; i < n; i++) 
        {
            if (a[i]>max) {
                max = a[i];
            }
        }

        for(int place = 1; max/place>0; place*=10)
        {
            countSort(a,n,place);
        }
    }

    void countSort(int a[],int n,int place)
    {
        int output[] = new int[n];
        int count[] = new int[10]; //bcz digits will be 0-9

        for (int i = 0; i < n; i++) {
            int temp = (a[i]/place)%10;
            count[temp]++;
        }

        

        for (int i = 1; i < 10; i++) 
        {
            count[i]+=count[i-1];    
        }
        
        // for (int i = 0; i < count.length; i++) {
        //     System.out.println("count = "+count[i]);
        // }
        // System.out.println();
        

        for(int i=n-1;i>=0;i--)
        {
            int save = (a[i]/place)%10;
            int temp = count[save]-1;

            output[temp] = a[i];
            count[save]--;
        }

        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }


}