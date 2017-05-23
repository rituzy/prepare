package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */
// Find the sum of all left leaves in a given binary tree.

// Example:

//     3
//    / \
//   9  20
//     /  \
//    15   7

// There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
public class SumOfLeftLeaves {

    public static int leftLeafsSum(TreeNode root){
        if (root == null) return 0;
        int result = 0;
        // left leaf of ritht node
        if (root.left != null) {
            //leaf does not have childs
            if (root.left.left == null && root.left.left == null)
                result += root.left.val;
            else
                result += leftLeafsSum(root.left);
        }
        // right leaf node
        result += leftLeafsSum(root.right);

        return result;
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
