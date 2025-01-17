package stacks_queues.stacks;

public class StackUse {
    public static void main(String[] args) throws StackFullException{
//        StackUsingArray stack = new StackUsingArray(3);
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                // Never reach here
            }
        }
    }
}
