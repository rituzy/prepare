package interviewsKdn251.Company.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 17.04.2017.
 */
// Given a binary tree, return all root-to-leaf paths.

// For example, given the following binary tree:

//    1
//  /   \
// 2     3
//  \
//   5
// All root-to-leaf paths are:

// ["1->2->5", "1->3"]
public class BinaryTreePaths {

    public static List<String> findPathFromRoot(TreeNode root){
        List<String> toReturn = new ArrayList<>();
        recursiveFinding("", root, toReturn);
        return toReturn;
    }

    private static void recursiveFinding(String s, TreeNode root, List<String> toReturn) {
        if (root.left  == null && root.right == null) toReturn.add(s + root.val);
        if (root.left  != null) recursiveFinding(s + root.val +" -> ", root.left, toReturn);
        if (root.right != null) recursiveFinding(s + root.val + " -> ", root.right, toReturn);
    }

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
