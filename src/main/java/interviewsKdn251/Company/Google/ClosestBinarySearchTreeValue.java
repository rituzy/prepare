package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Facebook.dfsf;

/**
 * Created by user on 23.04.2017.
 */
// Given a non-empty binary search tree and a target value, find the value in the BST that
// is closest to the target.

// Note:
// Given target value is a floating point.
// You are guaranteed to have only one unique value in the BST that is closest to the target.
public class ClosestBinarySearchTreeValue {
    public static int closestValue(TreeNode root, double target){
        if (root == null){
            throw new IllegalArgumentException();
        }

        int value = root.val;

        TreeNode child = value > target ? root.left : root.right;

        if (child == null) return value;

        int childValue = closestValue(child, target);

        return Math.abs(target - value) < Math.abs(target - childValue) ? value : childValue;
    }
}
