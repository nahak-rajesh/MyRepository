package BST;

import BinaryTrees.BinaryTreeNode;
import stacks_queues.quesue.QueueIsEmptyException;
import stacks_queues.quesue.QueueUsingLinkedList;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    LinkedListNode (T data) {
        this.data = data;
        next = null;
    }
}

class PairLL {
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
}

public class BSTToASortedLL {

    public static PairLL helper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            PairLL output = new PairLL();
            output.head = null;
            output.tail = null;
            return output;
        }
        PairLL leftTree = helper(root.left);
        LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);
        PairLL rightTree = helper(root.right);

        PairLL outPut = new PairLL();
        if (leftTree.head != null) {
            outPut.head = leftTree.head;
            leftTree.tail.next = newNode;
        } else {
            outPut.head = newNode;
        }
        newNode.next = rightTree.head;
        if (rightTree.head == null) {
            outPut.tail = newNode;
        } else {
            outPut.tail = rightTree.tail;
        }
        return outPut;
    }

    public static LinkedListNode<Integer> constructLL(BinaryTreeNode<Integer> root) {
        PairLL ans = helper(root);
        return ans.head;
    }

    public static void printLL(LinkedListNode<Integer> node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        QueueUsingLinkedList<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLinkedList<>();
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            try {
                BinaryTreeNode<Integer> front = pendingNodes.dequeue();
                System.out.print(front.data + " : ");
                if (front.left != null) {
                    System.out.print("L: " + front.left.data + ", ");
                    pendingNodes.enqueue(front.left);
                }
                if (front.right != null) {
                    System.out.print("R: " + front.right.data);
                    pendingNodes.enqueue(front.right);
                }
            } catch (QueueIsEmptyException e) {
                return;
            }
            System.out.println();
        }
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        QueueUsingLinkedList<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLinkedList<>();
        System.out.println("Enter the rootData : ");
        int rootData = s.nextInt();
        if (rootData == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front;
            try {
                front = pendingNodes.dequeue();
            } catch (QueueIsEmptyException e) {
                return null;
            }
            System.out.println("Enter left child of " + front.data + " : ");
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }
            System.out.println("Enter right child of " + front.data + " : ");
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }
        }
        return root;
    }

    public static void main(String[] arg) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        LinkedListNode<Integer> node = constructLL(root);
        printLL(node);
    }
}
