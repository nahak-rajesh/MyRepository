package Trees.Assignment;

import Trees.TreeNode;
import stacks_queues.quesue.QueueIsEmptyException;
import stacks_queues.quesue.QueueUsingLinkedList;

import java.util.Scanner;

public class MaxSumNode {

    public static int maxSumNode(TreeNode<Integer> root) {
        if (root == null)
            return 0;
        int sum = 0;
        int maxNode = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            sum += root.children.get(i).data;
        }
        for (int i = 0; i < root.children.size(); i++) {
            int temp = maxSumNode(root.children.get(i));
            if (sum < temp) {
                sum = temp;
                maxNode = root.children.get(i).data;
            }
        }
        return maxNode;
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
        System.out.println("MaxSumNode : " + maxSumNode(root));
    }
}
