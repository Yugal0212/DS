
import java.util.*;
import java.util.Stack;

public class Lab8_46 {
    public int inputprecedance(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 3;
        } else if (c == '^') {
            return 6;
        } else if (c == '(') {
            return 9;
        } else if (c == ')') {
            return 0;
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return 7;
        } else {
            System.out.println("invalid character");
            return -1;
        }

    }

    public int stackprecedance(char c) {
        if (c == '+' || c == '-') {
            return 2;
        } else if (c == '*' || c == '/') {
            return 4;
        } else if (c == '^') {
            return 5;
        } else if (c == '(') {
            return 0;
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return 8;
        } else {
            System.out.println("invalid character");
            return -1;
        }
    }

    public int rankprecedance(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            return -1;
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return 1;
        } else {
            System.out.println("invalid character");
            return 0;
        }
    }

    public void revpol(String revinfix) {
        Stack<Character> s = new Stack<>();

        revinfix = revinfix + ")";
        String polish = "";
        int rank = 0;

        s.push('(');

        for (int i = 0; i < revinfix.length(); i++) {
            char next = revinfix.charAt(i);

            while (stackprecedance(s.peek()) > inputprecedance(next)) {
                char temp = s.pop();
                polish = polish + temp;
                rank = rank + rankprecedance(temp);

                if (rank < 1) {
                    System.out.println("Invalid");
                }
            }

            if (stackprecedance(s.peek()) != inputprecedance(next)) {
                s.push(next);
            } else {
                s.pop();
            }
        }

        String ans = "";

        for (int i = polish.length() - 1; i >= 0; i--) {
            ans = ans + polish.charAt(i);
        }

        if (!s.isEmpty() || rank != 1) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid :- " + ans);
        }
    }

    public void reverseinfix(String infix) {
        String revinfix = "";
        for (int i = infix.length() - 1; i >= 0.; i--) {
            if (infix.charAt(i) == '(') {
                revinfix = revinfix + ")";
            } else if (infix.charAt(i) == ')') {
                revinfix = revinfix + "(";
            } else {
                revinfix = revinfix + infix.charAt(i);
            }
        }
        System.out.println(revinfix);

        revpol(revinfix);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lab8_46 l1 = new Lab8_46();

        System.out.print("Enter Infix Notaion = ");
        String infix = sc.nextLine();

        l1.reverseinfix(infix);

    }

}