package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Amazon.ValidateBinarySearchTree;
import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by user on 23.04.2017.
 */
// Implement an iterator over a binary search tree (BST). Your iterator will be
// initialized with the root node of a BST.

// Calling next() will return the next smallest number in the BST.

// Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h
// is the height of the tree.
public class BinarySearchTreeIterator {

    public static Stack<TreeNode> stack;

    public BinarySearchTreeIterator(TreeNode root) {
        stack = new Stack<>();

        while (root != null){
            stack.push(root);
            root = root.left;
        }
    }



    public static int next(){
        TreeNode minNode = stack.pop();
        TreeNode addToStack = minNode.right;

        while (addToStack != null){
            stack.push(addToStack);
            addToStack = addToStack.left;
        }

        return minNode.val;
    }

    private static boolean hasNext() {
        return stack.isEmpty();
    }

    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
