package interviewsKdn251.Company.Amazon;

/**
 * Created by user on 16.04.2017.
 */
// Given a binary tree, determine if it is a valid binary search tree (BST).

// Assume a BST is defined as follows:

// The left subtree of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.
// Both the left and right subtrees must also be binary search trees.
// Example 1:
//     2
//    / \
//   1   3
// Binary tree [2,1,3], return true.
// Example 2:
//     1
//    / \
//   2   3
// Binary tree [1,2,3], return false.
public class ValidateBinarySearchTree {

    public static boolean isValidTree(TreeNode root){

        if (root == null) return true;

        return isValidTreeRec(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private static boolean isValidTreeRec(TreeNode root, long minValue, long maxValue) {
        if (root == null){
            return true;
        } else if (root.val >= maxValue || root.val <= minValue){
            return false;
        } else return isValidTreeRec(root.left, minValue, root.val)
                && isValidTreeRec(root.right, root.val, maxValue);
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
