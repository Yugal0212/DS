import java.util.Scanner;
import java.util.Stack;

public class Lab7_41 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) 
        {
            System.out.print("Enter the string of parentheses: ");
            String input = scanner.nextLine();
            int result = isBalanced(input) ? 1 : 0;
            System.out.println("Output: " + result);
        }
    }

    private static boolean isBalanced(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) 
        {
            if (c == '(' || c == '{' || c == '[') 
            {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') 
            {
                if (stack.isEmpty()) 
                {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) 
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
