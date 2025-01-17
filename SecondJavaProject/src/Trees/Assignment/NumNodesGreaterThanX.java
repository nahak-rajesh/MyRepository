package Trees.Assignment;

import Trees.TreeNode;
import stacks_queues.quesue.QueueIsEmptyException;
import stacks_queues.quesue.QueueUsingLinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumNodesGreaterThanX {

    public static int countNodesGreaterThanX(TreeNode<Integer> root, int x) {
        if (root == null)
            return 0;
        int count = 0;
        if (root.data > x) {
            count++;
        }
        for (int i = 0; i < root.children.size(); i++) {
            count += countNodesGreaterThanX(root.children.get(i), x);
        }
        return count;
    }

    public static TreeNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rootData : ");
        int rootData = s.nextInt();

        QueueUsingLinkedList<TreeNode<Integer>> pendingNodes = new QueueUsingLinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter no of Children of " + frontNode.data + " : ");
                int numChild = s.nextInt();
                for (int i = 0; i < numChild; i++) {
                    System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data + " : ");
                    int child = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }
            } catch (QueueIsEmptyException e) {
                return null;
            }
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        QueueUsingLinkedList<TreeNode<Integer>> pendingNodes = new QueueUsingLinkedList<>();
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.print(frontNode.data + " : ");
                for (int i = 0; i < frontNode.children.size(); i++) {
                    System.out.print(frontNode.children.get(i).data + ", ");
                    pendingNodes.enqueue(frontNode.children.get(i));
                }
                System.out.println();
            } catch (QueueIsEmptyException e) {
                // Should not come here
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        TreeNode<Integer> root = takeInput();
        print(root);
        System.out.println("Enter x : ");
        int x = s.nextInt();
        System.out.println("No of Nodes Greater Than " + x + " : " + countNodesGreaterThanX(root, x));
    }
}
