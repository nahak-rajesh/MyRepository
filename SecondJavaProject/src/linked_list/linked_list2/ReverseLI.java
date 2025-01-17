package linked_list.linked_list2;

import java.util.Scanner;

public class ReverseLI {

    // 10.11 Reverse Iteratively
    public static Node2<Integer> reverseIterative(Node2<Integer> head) {
        Node2<Integer> curr = head;
        Node2<Integer> prev = null;
        Node2<Integer> temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // 10.9 Reverse Recursively
    public static Node2<Integer> reverseLL3(Node2<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node2<Integer> reversedTail = head.next;
        Node2<Integer> smallHead = reverseLL3(head.next);
        reversedTail.next = head;
        head.next = null;
        return smallHead;
    }

    public static DoubleNode reverseLLBetter (Node2<Integer> head) {
        if (head == null || head.next == null) {
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode smallAns = reverseLLBetter(head.next);
        smallAns.tail = head;
        head.next = null;

        DoubleNode ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }
    public static Node2<Integer> reverseR(Node2<Integer> head) {
        if (head == null || head.next == null)
            return head;
        Node2<Integer> finalHead = reverseR(head.next);
        Node2<Integer> temp = finalHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return finalHead;
    }

    // Take I/P for LI
    public static Node2<Integer> takeInput() {
        Node2<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1) {
            Node2<Integer> newNode = new Node2<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    // Print the LI
    public static void print(Node2<Integer> head) {
        Node2<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node2<Integer> head = takeInput();
        print(head);
//        head = reverseR(head);
//        print(head);
//        DoubleNode ans = reverseLLBetter(head);
//        print(ans.head);
//        head = reverseLL3(head);
//        print(head);
        head = reverseIterative(head);
        print(head);
    }
}
