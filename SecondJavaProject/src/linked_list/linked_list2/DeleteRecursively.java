package linked_list.linked_list2;

import java.util.Scanner;

public class DeleteRecursively {
    public static Node2<Integer> remove(Node2<Integer> head, int pos) {
        if (pos == 0) {
            return head.next;
        }
        if (head == null)
            return head;

        head.next = remove(head.next, pos - 1);
        return head;
    }

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
        head = remove(head,3);
        print(head);
    }
}
