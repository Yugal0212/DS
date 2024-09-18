//38. Write a menu driven program to implement following operations on the Stack 
// using an Array 
//  PUSH, POP, DISPLAY 
//  PEEP, CHANGE 

import java.util.Scanner;

class Stackdemo {
    int top = -1;
    int a[] = new int[20];

    void push(int x) {
        if (top >= a.length) {
            System.out.println("stack overflow");
        } else {
            top = top + 1;
            a[top] = x;
            return;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            top = top - 1;
            return a[top + 1];
        }
    }

    int peep(int i) {
        if ((top - i + 1) <= -1) {
            System.out.println("stack underflow");
            return 0;
        } else {
            return a[top - i + 1];
        }
    }

    int CHANGE(int i, int x) {
        if ((top - i + 1) <= -1) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            a[top - i + 1] = x;
            return a[top - i + 1];
        }
    }

    void DISPLAY() {
        for (int i = top; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}

public class Lab7_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stackdemo s = new Stackdemo();
        while (true) {
            System.out.println("|| 1.push ||  2.pop|| 3.peep || 4.Change|| 5.Exit ||");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter a Element of num::");
                    int x = sc.nextInt();
                    s.push(x);
                    s.DISPLAY();
                    break;

                case 2:

                    System.out.println("return value ::" + s.pop());
                    s.DISPLAY();
                    break;

                case 3:

                    System.out.print("enter top of element ");
                    int i = sc.nextInt();
                    System.out.println("return value::" + s.peep(i));
                    s.DISPLAY();
                    break;

                case 4:

                    System.out.print("enter index ");
                    int index = sc.nextInt();
                    System.out.print("enter value");
                    int value = sc.nextInt();
                    System.out.println("return value::" + s.CHANGE(index, value));
                    s.DISPLAY();
                    break;

                case 5:

                    System.exit(0);

                default:
                    System.out.println("invalid number");
            }
        }

    }
}
