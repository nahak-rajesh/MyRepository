package TrieDS;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word) {
        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if(word.length() == 0){
            return root.isTerminating;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null) {
           return false;
        }
        return search(child, word.substring(1));
    }

    public boolean search(String word) {
        return search(root, word);
    }

    private void remove(TrieNode root, String word) {
        if(word.length() == 0) {
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null) {
            return;
        }
        remove(child, word.substring(1));
        // We can remove child node only if it is non-terminating and its no of childern are 0
//        if(!child.isTerminating) {
//            int numChild = 0;
//            for(int i = 0; i < 26; i++) {
//                if(child.children[i] != null) {
//                    numChild++;
//                }
//            }
//            if(numChild == 0) {
//                // We can delete child
//                root.children[childIndex] = null;
//                child = null;
//            }
        // We can customize the above commented parts by simple adding a childCount variable
        if (!child.isTerminating && child.childCount == 0) {
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
    }

    public void remove(String word) {
        remove(root, word);
    }
}
