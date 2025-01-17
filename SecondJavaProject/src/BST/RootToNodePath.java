package BST;

import BinaryTrees.BinaryTreeNode;
import stacks_queues.quesue.QueueIsEmptyException;
import stacks_queues.quesue.QueueUsingLinkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class RootToNodePath {

    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data) {
        if(root == null) return null;
        if(root.data == data) {
           ArrayList<Integer> output = new ArrayList<>();
           output.add(root.data);
           return output;
        }
        ArrayList<Integer> leftOutput = getRootToNodePath(root.left, data);
        if(leftOutput != null) {
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = getRootToNodePath(root.right, data);
        if(rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        } else {
            return null;
        }
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println("Enter the NodePath Data : ");
        int data = s.nextInt();
        System.out.println(getRootToNodePath(root, data));
    }

}
