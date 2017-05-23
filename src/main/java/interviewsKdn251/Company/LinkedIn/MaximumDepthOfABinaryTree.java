package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 20.05.2017.
 */
// Given a binary tree, find its maximum depth.

// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
public class MaximumDepthOfABinaryTree {
    public static int getMaxLenTree(TreeNode root){
        if (root == null) return 0;

        return 1 + Math.max(getMaxLenTree(root.left), getMaxLenTree(root.right));
    }
}
