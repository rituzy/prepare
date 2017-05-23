package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 20.05.2017.
 */
// Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

// For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

//     1
//    / \
//   2   2
//  / \ / \
// 3  4 4  3
// But the following [1,2,2,null,3,null,3] is not:
//     1
//    / \
//   2   2
//    \   \
//    3    3
public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root){
        if (root == null) return true;

        return recursiveCheck(root.left, root.right);
    }

    private static boolean recursiveCheck(TreeNode left, TreeNode right) {
        // if both are null than symmetric
        if (left == null && right == null) return true;

        // if any of nodes is null or values differ than false
        if (left == null || right == null || left.val != right.val) return false;

        return recursiveCheck(left.left, right.right) && recursiveCheck(left.right, right.left);
    }
}
