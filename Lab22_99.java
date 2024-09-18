//99. Write a program to implement Shell Sort using Array.
public class Lab22_99 {
    public static void main(String[] args) {
        int a[] = { 5, 8, 12, 1, 6, 7, 0, 39, 11, 25, 34 };
        int n = a.length;
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i--) {
                    if (a[i + gap] > a[i]) {
                        break;
                    } else {
                        int temp = a[i + gap];
                        a[i + gap] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
