package interviewsKdn251.Company.LinkedIn;

import interviewsKdn251.Company.Amazon.ValidateBinarySearchTree;
import sun.reflect.generics.tree.Tree;

/**
 * Created by user on 20.05.2017.
 */
// Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

// According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v
// and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant
// of itself).”

//         _______3______
//        /              \
//     ___5__          ___1__
//    /      \        /      \
//    6      _2       0       8
//          /  \
//          7   4
// For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5,
// since a node can be a descendant of itself according to the LCA definition.

public class LowestCommonAncestorOfABinaryTree {
        public static TreeNode getAncestor(TreeNode root, TreeNode first, TreeNode second){
            // root = null means we reached the leaf and we have to return null
            if (root == null || first == root || second == root) return root;

            TreeNode left = getAncestor(root.left, first, second);
            TreeNode right = getAncestor(root.right, first, second);
            // when there are not null (found) nodes on both sides of subtree: the ancesstor is root
            if (left != null && right != null) return root;
            // when there is only one not null node, return it as it's a candidate to be ancesstor
            // !!! if both are null return null (does not matter which) !!!
            return left != null ? left : right;
        }
}
