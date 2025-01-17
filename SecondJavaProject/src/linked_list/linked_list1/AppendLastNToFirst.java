package linked_list.linked_list1;

import java.util.Scanner;

public class AppendLastNToFirst {

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int pos) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count ++;
        }
        int newCount = count - pos;
        count = 0;
        Node<Integer> temp1 = head;
        while (count < newCount - 1) {
            temp1 = temp1.next;
            count ++;
        }
        Node<Integer> temp2 = temp1.next;
        Node<Integer> temp3 = temp1.next;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = head;
        temp1.next = null;
        return temp3;
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
                tail = tail.next;
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
        Scanner s = new Scanner(System.in);
        Node<Integer> head = takeInput();
        print(head);
        int pos = s.nextInt();
        head = appendLastNToFirst(head, pos);
        print(head);
    }
}
