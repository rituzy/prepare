package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 20.04.2017.
 */
// Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

// According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

//         _______3______
//        /              \
//     ___5__          ___1__
//    /      \        /      \
//    6      _2       0       8
//          /  \
//          7   4
// For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

public class LowestCommonAncestorOfABinaryTree {

    public static TreeNode findAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        // recursive finding
        TreeNode left = findAncestor(root.left, p, q);
        TreeNode right = findAncestor(root.right, p, q);
        // if both not a null than one common parent is root(the nodes in left and right subtrees)
        if (left != null && q != null) return root;
        // nodes are in the one of subtrees
        return left != null ? left : right;
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
