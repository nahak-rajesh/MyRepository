package stacks_queues.stacks;

import java.util.Scanner;

public class BalancedParenthesis {

    public static boolean isBalanced(String exp) throws StackEmptyException {
        if (exp.length() % 2 != 0)
            return false;
        StackUsingLinkedList<Character> stack = new StackUsingLinkedList<>();
        for (int i = 0; i < exp.length(); i++) {
            Character c = exp.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (c == ']') {
                        if (stack.top() == '[') {
                            stack.pop();
                        } else return false;
                    } else if (c == '}') {
                        if (stack.top() == '{') {
                            stack.pop();
                        } else return false;
                    } else if (c == ')') {
                        if (stack.top() == '(') {
                            stack.pop();
                        } else return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String exp = s.next();
        try {
            System.out.println("BalancedParenthesis :" + isBalanced(exp));
        } catch (StackEmptyException e) {
            System.out.println("Stack is empty.");
        }
    }
}
