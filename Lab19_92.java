//94. Write a program to implement Bubble using Array. 
class Sort {
    void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

public class Lab19_92 {
    public static void main(String[] args) {
        int a[] = { 5, 7, 9, 0, 3, 6, 8 };
        Sort s = new Sort();
        s.bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}