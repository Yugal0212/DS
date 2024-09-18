// 3. charater is vowel or not :-

import java.util.Scanner;

public class Lab1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a charecter:");
        String ch = sc.nextLine();
        if (ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('o') || ch.equals('u')) {
            System.out.println("character is vowel");
        } else {
            System.out.println("characterv is not vowel");
        }

    }
}