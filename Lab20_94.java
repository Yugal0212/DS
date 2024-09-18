// Write a program to implement Selection Sort using Array. 
public class Lab20_94 {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5, 0, };
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }

            }
            int temp2 = arr[i];
            arr[i] = arr[temp];
            arr[temp] = temp2;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
