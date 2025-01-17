package linked_list.linked_list1;

import java.util.Scanner;

public class PrintReverseLinkedList {

    public static void revList (Node<Integer> head) {
        if (head == null)
            return;
        revList(head.next);
        System.out.print(head.data + " ");
    }
    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
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
    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
        System.out.println("Rev List : ");
        revList(head);
    }
}
