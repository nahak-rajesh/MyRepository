package linked_list.linked_list1;

import java.util.Scanner;

public class FindANodeInLinkedList {
    public static int find(Node<Integer> head, int n) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            if (temp.data == n)
                return count;
            else {
                temp = temp.next;
                count ++;
            }
        }
        return -1;
    }
    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while(data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node<Integer> head = takeInput();
        print(head);
        System.out.println("num :");
        int n = s.nextInt();
        System.out.println("Pos of " + n + " : " + find(head, n));
    }
}
