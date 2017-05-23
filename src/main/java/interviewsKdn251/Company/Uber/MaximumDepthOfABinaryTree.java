package interviewsKdn251.Company.Uber;

import interviewsKdn251.Company.Amazon.ValidateBinarySearchTree;

/**
 * Created by user on 22.05.2017.
 */
public class MaximumDepthOfABinaryTree {
    public static int getMaxDepth(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(getMaxDepth(root.left), getMaxDepth(root.right));
    }
}
