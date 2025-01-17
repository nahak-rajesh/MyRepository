package linked_list.linked_list2;

import linked_list.linked_list1.Node;

import java.util.Scanner;

public class MidPointOfLL {

    public static int midPoint(Node2<Integer> head) {
        Node2<Integer> fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
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
        System.out.println(midPoint(head));
    }
}
