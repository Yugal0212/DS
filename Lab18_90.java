public class Lab18_90 {
    void linerserch(int n[], int k) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == k) {
                System.out.println("Element found at index: " + i);
                return;
            }

        }
        System.out.println("Element no found at index");
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5 };
        int k = 4;
        Lab18_90 obj = new Lab18_90();
        obj.linerserch(n, k);

    }
}
