
//Write a program for evaluation of prefix Expression using Stack.
import java.util.Scanner;
import java.lang.Math;

class Stackdemo {
    int top = -1;
    int a[];

    Stackdemo(int size) {
        a = new int[size];
    }

    void push(int x) {
        if (top >= a.length) {
            System.out.println("Stack overflow");
        } else {
            top += 1;
            a[top] = x;
            return;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            top -= 1;
            return a[top + 1];
        }
    }
}

class Lab8_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix expression:");
        String postfix = sc.next();
        System.out.println("Answer:" + Evaluate_postfix(postfix));
    }

    public static int Evaluate_postfix(String postfix) {
        Stackdemo sd = new Stackdemo(postfix.length());
        String arr[] = postfix.split("");
        int operand1, operand2;
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];

            if (!temp.equals("+") && !temp.equals("-") && !temp.equals("/") && !temp.equals("*") && !temp.equals("^")) {
                sd.push(Integer.parseInt(temp));
            } else {
                String operator = arr[i];
                operand1 = sd.pop();
                operand2 = sd.pop();

                if (operator.equals("+")) {
                    value = operand1 + operand2;
                    sd.push(value);
                } else if (operator.equals("-")) {
                    value = operand1 - operand2;
                    sd.push(value);
                } else if (operator.equals("/")) {
                    value = operand1 / operand2;
                    sd.push(value);
                } else if (operator.equals("*")) {
                    value = operand1 * operand2;
                    sd.push((value));
                } else if (operator.equals("^")) {
                    value = (int) Math.pow(operand1, operand2);
                    sd.push(value);
                } else {
                    System.out.println("Invalid operator");
                }
            }
        }
        return sd.pop();
    }
}