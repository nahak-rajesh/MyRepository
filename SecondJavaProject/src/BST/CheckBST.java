package BST;

import BinaryTrees.BinaryTreeNode;
import BinaryTrees.Pair;
import stacks_queues.quesue.QueueIsEmptyException;
import stacks_queues.quesue.QueueUsingLinkedList;

import java.util.Scanner;

public class CheckBST {

    public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
        if (root == null) return true;
        if (root.data < min || root.data > max) return false;
        boolean isLeftOk = isBST3(root.left, min, root.data - 1);
        boolean isRightOk = isBST3(root.right, root.data, max);
        return isLeftOk && isRightOk;
    }

    public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Boolean, Pair<Integer, Integer>> outPut = new Pair<>();
            outPut.first = true;
            outPut.second = new Pair<>();
            outPut.second.first = Integer.MAX_VALUE;
            outPut.second.second = Integer.MIN_VALUE;
            return outPut;
        }
        Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBST2(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBST2(root.right);
        int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
        boolean isBST = (root.data > leftOutput.second.second) && (root.data <=rightOutput.second.first) && leftOutput.first && rightOutput.first;
        Pair<Boolean, Pair<Integer, Integer>> outPut = new Pair<>();
        outPut.first = isBST;
        outPut.second = new Pair<>();
        outPut.second.first = min;
        outPut.second.second = max;
        return outPut;
    }

    public static int maximum(BinaryTreeNode<Integer> root) {
        if (root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) return true;
        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right);
        if (root.data <= leftMax) return false;
        if (root.data > rightMin) return false;
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        return isLeftBST && isRightBST;
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
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println("IsBST : " + isBST(root));
        System.out.println("IsBST : " + isBST2(root).first);
    }
}
