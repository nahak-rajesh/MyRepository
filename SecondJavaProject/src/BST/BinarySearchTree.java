package BST;

import BinaryTrees.BinaryTreeNode;

public class BinarySearchTree {

    private BinaryTreeNode<Integer> root;

    private void printTree (BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String toBePrinted = root.data + ":";
        if (root.left != null) {
            toBePrinted += " L: " + root.left.data + ", ";
        }
        if (root.right != null) {
            toBePrinted += " R: " + root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    }

    public void printTree() {
        printTree(root);
    }

    public void insertData(int data) {
        root = insertDataHelper(root, data);
    }

    private BinaryTreeNode<Integer> insertDataHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            BinaryTreeNode<Integer> newRoot =new  BinaryTreeNode<>(data);
            return newRoot;
        }
        if (root.data > data) {
            root.left = insertDataHelper(root.left, data);
        } else {
            root.right = insertDataHelper(root.right, data);
        }
        return root;
    }

    public void deleteData(int data) {
        root = deleteDataHelper(root, data);
    }

    private BinaryTreeNode<Integer> deleteDataHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = deleteDataHelper(root.left, data);
            return root;
        } else if (data > root.data) {
            root.right = deleteDataHelper(root.right, data);
            return root;
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                BinaryTreeNode<Integer> minNode = root.right;
                while (minNode.left != null) {
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteDataHelper(root.right, minNode.data);
                return root;
            }
        }
    }


    private boolean hasDataHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null) return false;
        if (root.data == data) {
            return true;
        } else if (data > root.data) {
            return hasDataHelper(root.right, data);
        } else {
            return hasDataHelper(root.left, data);
        }
    }

    public boolean hasData(int data) {
        return hasDataHelper(root, data);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertData(10);
        bst.insertData(20);
        bst.insertData(5);
        bst.insertData(15);
        bst.insertData(3);
        bst.insertData(7);
        bst.printTree();
        System.out.println("Delete 10: ");
        bst.deleteData(10);
        bst.printTree();
    }
}
