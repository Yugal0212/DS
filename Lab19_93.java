// Write a program to implement Insertion Sort using Array.
class Insertion_Sort {
    void Insertion_Sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            
        }
    }
}

public class Lab19_93 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        Insertion_Sort ob = new Insertion_Sort();
        ob.Insertion_Sort(arr);
        System.out.println("Sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
