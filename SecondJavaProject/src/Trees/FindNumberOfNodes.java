package Trees;

import com.sun.source.tree.Tree;
import stacks_queues.quesue.QueueIsEmptyException;
import stacks_queues.quesue.QueueUsingLinkedList;

import java.util.Scanner;

public class FindNumberOfNodes {

    public static int numOfLeafNodes(TreeNode<Integer> root) {
        if(root == null)
            return 0;
        int count = 0;
        if(root.children.size() == 0)
            count++;
        for(int i = 0; i < root.children.size(); i++) {
            count += numOfLeafNodes(root.children.get(i));
        }
        return count;
    }

    public static int numOfNodesGraterThanX(TreeNode<Integer> root, int x) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        if(root.data > x)
            count++;
        for(int i = 0; i < root.children.size(); i++) {
           count += numOfNodesGraterThanX(root.children.get(i), x);
        }
        return count;
    }

    public static int numOfNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count += numOfNodes(root.children.get(i));
        }
        return count;
    }

    public static TreeNode<Integer> takeInputLevelWise() {
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
                // Should not come here
                return null;
            }
        }
        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root) {

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
        TreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println("---------------------------------------------------------");
        System.out.println("Num of Nodes : " + numOfNodes(root));
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Compared Num : ");
        int x = s.nextInt();
        System.out.println("Number of Nodes GreaterThan " + x + " : " + numOfNodesGraterThanX(root, x));
        System.out.println("---------------------------------------------------------");
        System.out.println("Number Of Leaf Nodes : " + numOfLeafNodes(root));
    }
}
