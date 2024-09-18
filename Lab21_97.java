//97. Write a program to implement Quick Sort using Array 
class Quick_sort {
    int partition(int a[], int LB, int UB) {
        int pivot = a[UB];

        int i = LB - 1;

        for (int j = LB; j < UB; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[UB] = temp;

        return i;

    }

    void sort(int a[], int LB, int UB) {
        if (LB < UB) {
            int pivotIndex = partition(a, LB, UB);
            sort(a, LB, pivotIndex - 1);
            sort(a, pivotIndex + 1, UB);
        }
    }

}

public class Lab21_97 {

    public static void main(String[] args) {
        Quick_sort q = new Quick_sort();
        int a[] = { 5, 6, 8, 12, 23, 2, 45, 7 };

        q.sort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }
}