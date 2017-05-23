package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 19.04.2017.
 */
// Given a binary search tree and a node in it, find the in-order successor of that node in the BST.

// Note: If the given node has no in-order successor in the tree, return null.
public class InorderSuccessorInBST {

    public static TreeNode getSuccessor(TreeNode root, TreeNode p){
        TreeNode successor = null;

        while (root != null){
            if (root.val > p.val){
                successor = root;
                root = root.left;
            }else{
                root = root.right;
            }
        }

        return successor;
    }

    public static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
