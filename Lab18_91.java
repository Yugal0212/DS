public class Lab18_91 {

    // void binarySearch(int n[], int k) {
    // int first = 0;
    // int last = n.length - 1;
    // int mid;
    // while (first <= last) {
    // mid = (first + last) / 2;
    // if (n[mid] == k) {
    // System.out.println("Element found at index " + mid);
    // return;
    // } else if (n[mid] < k) {

    // first = mid + 1;
    // }

    // else {
    // last = mid - 1;
    // }

    // }
    // System.out.println("Element not found in array");
    // }

    // write a binary search using recursion;
    int binarySearch(int n[], int first, int last, int k) {
        if (first <= last) {
            int mid = (first + last) / 2;
            if (n[mid] == k) {
                return mid;
            } else if (n[mid] < k) {
                return binarySearch(n, mid + 1, last, k);
            }

            else {
                return binarySearch(n, first, mid - 1, k);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6, 7, };
        int k = 5;
        Lab18_91 bs = new Lab18_91();
        System.out.println(bs.binarySearch(n, 0, n.length - 1, k));
    }
}
