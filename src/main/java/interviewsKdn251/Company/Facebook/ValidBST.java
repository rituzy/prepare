package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 23.04.2017.
 */
public class ValidBST {

    public static boolean isValidBST(TreeNode root){
        if (root == null || root.left == null || root.right == null) return true;
        if (root.left.val > root.val || root.right.val < root.val) return false;
        if (!isValidBST(root.left)) return false;
        return  isValidBST(root.right);
    }

    public static boolean isValidBSTRec(TreeNode root){
        return isValidBSTRecursive(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBSTRecursive(TreeNode root, int minValue, int maxValue){
        if (root == null){
            return true;
        }else if (root.val <= minValue || root.val >= maxValue){
            return false;
        }else {
            return isValidBSTRecursive(root.left, minValue, root.val)
                    && isValidBSTRecursive(root.right, root.val, maxValue);
        }
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
