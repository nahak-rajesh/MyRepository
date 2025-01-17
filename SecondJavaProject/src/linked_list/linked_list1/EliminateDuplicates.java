package linked_list.linked_list1;

import java.util.Scanner;

public class EliminateDuplicates {

    public static void eliminateDup(Node<Integer> head) {
        Node<Integer> temp1 = head, temp2 = head.next;
        while (temp2 != null) {
            if (temp1.data.equals(temp2.data))
                temp2 = temp2.next;
            else {
                temp1.next = temp2;
                temp1=temp2;
            }
        }
        temp1.next = null;
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
        eliminateDup(head);
        print(head);
    }
}
