package linked_list.linked_list1;

import java.util.Scanner;

public class LinkedListUse {

    public static int get(Node<Integer> head, int pos) {
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos) {
            temp = temp.next;
            i++;
        }
        return temp.data;
    }
    // Size of the LinkedList
    public static int size(Node<Integer> head) {
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            count ++;
            temp = temp.next;
        }
        return count;
    }
// Delete a Node from LinkedList
    public static Node<Integer> remove(Node<Integer> head, int pos) {
        if (pos == 0) {
            head = head.next;
            return head;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }

    // Insert a Node in LinkedList
    public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
        Node<Integer> newNode = new Node<>(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
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
//                Node<Integer> temp = head;
//                while (temp.next != null) {
//                    temp = temp.next;
//                }
//                temp.next = newNode;
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head) {
//        Node<Integer> temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
//        head = temp;
        System.out.println();
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//        System.out.println();
    }
    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<>(10);
//        System.out.println(node1.data);
//        System.out.println(node1.next);
//        Node<Integer> node2 = new Node<>(20);
//        node1.next = node2;
//        System.out.println(node2.data);
//        System.out.println(node1.next);
//        System.out.println(node2.next);
//        Node<Integer> node3 = new Node<>(30);
//        node2.next = node3;
//        Node<Integer> head = node1;
//        print(head);
//        print(head);
        Node<Integer> head = takeInput();
        head = insert(head, 100, 0);
        print(head);
        System.out.println("Size : " + size(head));
        System.out.println("getElement :" + get(head,0));
        head = remove(head, 2);
        print(head);
        System.out.println("Size : " + size(head));
    }
}
