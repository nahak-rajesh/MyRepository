package linked_list.linked_list2;

import java.util.Scanner;

public class InsertRecursively {

    public static Node2<Integer> insert(Node2<Integer> head, int pos, int elem) {
        if (pos == 0) {
            Node2<Integer> newNode = new Node2<>(elem);
            newNode.next = head;
            return newNode;
        }
        if (head == null)
            return head;

        head.next = insert(head.next, pos - 1, elem);
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
        head = insert(head,3,100);
        print(head);
    }
}
