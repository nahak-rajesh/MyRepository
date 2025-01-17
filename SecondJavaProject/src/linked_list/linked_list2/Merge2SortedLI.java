package linked_list.linked_list2;

import java.util.Scanner;

public class Merge2SortedLI {

    public static Node2<Integer> merge (Node2<Integer> head1, Node2<Integer> head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        Node2<Integer> t1 = head1, t2 = head2, head = null, tail = null;
        if (t1.data > t2.data) {
            head = t2;
            tail = t2;
            t2 = t2.next;
        } else {
            head = t1;
            tail = t1;
            t1 = t1.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data > t2.data) {
                tail.next = t2;
                tail = tail.next;
                t2 = t2.next;
            } else {
                tail.next = t1;
                tail = tail.next;
                t1 = t1.next;
            }
        }
        if (t1 == null)
            tail.next = t2;
        if (t2 == null)
            tail.next = t1;
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
        Node2<Integer> head1 = takeInput();
        print(head1);
        Node2<Integer> head2 = takeInput();
        print(head2);
        Node2<Integer> head = merge(head1, head2);
        print(head);
    }
}
