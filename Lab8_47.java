import java.util.Scanner;
import java.util.Stack;

public class Lab8_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        String s = "312*+";
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                String s3 = "";
                s3 = s3 + ch;
                int a = Integer.parseInt(s3);
                System.out.println(a);
                st.push(a);
            } else {
                int op2 = st.pop();
                int op1 = st.pop();
                if (ch == '+') {
                    value = op1 + op2;
                    st.push(value);
                } else if (ch == '-') {
                    value = op1 - op2;
                    st.push(value);
                } else if (ch == '*') {
                    value = op1 * op2;
                    st.push(value);
                } else if (ch == '/') {
                    value = op1 / op2;
                    st.push(value);
                }
            }
        }
        System.out.println(st.pop());
    }
}
