package stacks_queues.stacks;

import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = {5,4,6,7,8};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
