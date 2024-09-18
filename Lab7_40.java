import java.util.Scanner;

class Stackdemo {
    int top = -1;
    char a[];

    Stackdemo(int i) {
        a = new char[i];
    }

    void push(char x) {
        if (top >= a.length) {
            System.out.println("stack overflow");
        } else {
            top = top + 1;
            a[top] = x;
            return;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            top = top - 1;
            return a[top + 1];
        }
    }

}

public class Lab7_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String only a and b:");
        String st = sc.nextLine();
        Stackdemo a = new Stackdemo(st.length());
        Stackdemo b = new Stackdemo(st.length());
        int top = 0;
        while (top < st.length()) {
            if (st.charAt(top) == 'a') {
                a.push(st.charAt(top));
                top++;
            } else if (st.charAt(top) == 'b') {
                b.push(st.charAt(top));
                top++;
            } else {
                System.out.println("Invalid input---");
                return;
            }
        }
        if (a.top == b.top) {
            System.out.println("  your stirng is valid!");
        } else {
            System.out.println(" your stirng is Invalid!");
        }
    }
}