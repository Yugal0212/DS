// Write a program to implement Merge Sort using Array.
class MargeSort {
    void morgeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        morgeSort(arr, low, mid);
        morgeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    void merge(int a[], int low, int mid, int high) {
        int n2[] = new int[high - low + 1];
        int h = low;
        int i = 0;
        int j = mid + 1;
        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                n2[i] = a[h];
                h++;
                i++;
            } else {
                n2[i] = a[j];
                j++;
                i++;
            }
        }
        while (h <= mid) {
            n2[i] = a[h];
            h++;
            i++;
        }
        while (j <= high) {
            n2[i] = a[j];
            i++;
            j++;
        }
        int j5 = low;
        for (int j2 = 0; j2 < n2.length; j2++) {
            a[j5] = n2[j2];
            j5++;
        }
    }
}

public class Lab21_96 {
    public static void main(String[] args) {
        int arr[] = { 25, 57, 98, 0, 23, 45, 12, 67, 23 };
        MargeSort m = new MargeSort();
        m.morgeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

    }
}