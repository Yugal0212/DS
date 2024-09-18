public class Counting_sort {
    public static void main(String[] args) {

        int a[] = { 3, 6, 4, 1, 3, 4, 1, 4, 2 };
        int n = a.length;
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        int b[] = new int[max + 1];
        int c[] = new int[a.length];

        for (int i = 0; i < n; i++) {
            int temp = a[i];
            b[temp] = b[temp] + 1;
        }

        for (int i = 1; i < b.length; i++) {

            b[i] = b[i] + b[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = a[i];
            int ttemp = b[temp] - 1;
            c[ttemp] = a[i];

            b[temp] -= 1;
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(" " + c[i]);
        }

    }
}
