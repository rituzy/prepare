package interviewsKdn251.Company.Facebook;

import interviewsKdn251.Company.Amazon.LowestCommonAncestorOfABinaryTree;
import interviewsKdn251.Company.Amazon.ValidateBinarySearchTree;

import java.util.Stack;

/**
 * Created by user on 17.04.2017.
 */
// Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root
// node of a BST.

// Calling next() will return the next smallest number in the BST.

// Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of
// the tree.

public class BinarySearchTreeIterator {

    Stack<TreeNode> stack = new Stack<>();

    public BinarySearchTreeIterator(TreeNode root){
        while (root != null){
            stack.push(root);
            root = root.left;
        }
    }

    public boolean hasNext(){
        return stack.isEmpty() ? false : true;
    }

    public int next(){
        // last element in stack (the smallest)
        TreeNode nextSmallest = stack.pop();
        // switch to the right branch of smallest element to find there the minimum
        TreeNode addToStack = nextSmallest.right;
        // go through left elements of this branch and add to the stack
        while(addToStack != null) {
            stack.add(addToStack);
            addToStack = addToStack.left;
        }
        // return current small element
        return nextSmallest.val;
    }

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
