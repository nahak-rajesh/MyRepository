package BST;

import BinaryTrees.BinaryTreeNode;
import stacks_queues.quesue.QueueIsEmptyException;
import stacks_queues.quesue.QueueUsingLinkedList;

import java.util.Scanner;

public class ConstructBSTFromSortedArray {

    public static BinaryTreeNode<Integer> createBST(int[] arr, int sI, int eI) {
        if (sI > eI) return null;
        int mid = (sI + eI) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = createBST(arr, sI, mid - 1);
        root.right = createBST(arr, mid + 1, eI);
        return root;
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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        BinaryTreeNode<Integer> root = createBST(arr, 0, arr.length - 1);
        printLevelWise(root);
    }

}
