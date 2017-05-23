package interviewsKdn251.Company.twitter;

import interviewsKdn251.Company.Amazon.ValidateBinarySearchTree;

/**
 * Created by user on 21.05.2017.
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
    public static TreeNode findLowesAncestor(TreeNode root, TreeNode leftNode,TreeNode rightNode){
        if (root == null || root == leftNode || root == rightNode) return root;

        TreeNode left = findLowesAncestor(root.left, leftNode, rightNode );
        TreeNode right = findLowesAncestor(root.right, leftNode, rightNode );

        if (left != null && right != null) return root;

        // if both are null does not matter which to return (it's a leaf)
        return left == null ? right : left;
    }
}
