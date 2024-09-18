import java.util.Scanner;

class Stackdemo {
    int top = -1;
    char a[];

    Stackdemo(int i) {
        a = new char[i];
    }

    void push(char x) {
        if (top >= a.length - 1) {
            System.out.println("stack overflow");
        } else {
            top = top + 1;
            a[top] = x;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            char temp = a[top];
            top = top - 1;
            return temp;
        }
    }

    int inputprecedance(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            case '(':
                return 9;
            case ')':
                return 0;
            default:
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    return 7;
                } else {
                    System.out.println("invalid character");
                    return -1;
                }
        }
    }

    int stackprecedance(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            case '(':
                return 0;
            default:
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    return 8;
                } else {
                    System.out.println("invalid character");
                    return -1;
                }
        }
    }

    int rankprecedance(char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return -1;
            default:
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    return 1;
                } else {
                    System.out.println("invalid character");
                    return 0;
                }
        }
    }

    int topindex() {
        return top;
    }
}

public class Lab8_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String st = sc.nextLine();
        Stackdemo a = new Stackdemo(st.length());
        a.push('(');
        st = st + ")";
        String polish = "";
        int rank = 0;
        int i = 0;
        char next;

        while (i < st.length()) {
            next = st.charAt(i);
            if (a.topindex() < 0) {
                System.out.println("invalid string1");
                return;
            }
            char temp = a.pop();
            while (a.stackprecedance(temp) > a.inputprecedance(next)) {
                polish += temp;
                rank += a.rankprecedance(temp);
                if (rank < 1) {
                    System.out.println("invalid string2");
                    return;
                }
                temp = a.pop();
            }
            if (a.stackprecedance(temp) != a.inputprecedance(next)) {
                a.push(temp);
                a.push(next);
            } else {
                a.push(temp);
            }
            i++;
        }
        if (a.topindex() != 0 || rank != 1) {
            System.out.println("invalid");

        } else {
            System.out.println("valid");
            System.out.println(polish);
        }
    }
}
