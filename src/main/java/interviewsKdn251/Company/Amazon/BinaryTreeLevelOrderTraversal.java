package interviewsKdn251.Company.Amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by user on 16.04.2017.
 */
// Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its level order traversal as:
// [
//   [3],
//   [9,20],
//   [15,7]
// ]
public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> getTreeAsList(TreeNode node){

        if (node == null){
            throw new IllegalArgumentException("node must be not null");
        }

        List<List<Integer>> toReturn = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(node);
        List<Integer> currentVal = new ArrayList<>();
        currentVal.add(node.value);
        toReturn.add(currentVal);

        while (!queue.isEmpty()){
            Queue<TreeNode> currentLevel = new LinkedList<>();

            currentVal = new ArrayList<>();

            while (!queue.isEmpty()) {

                TreeNode rootNode = queue.remove();

                if (rootNode.left != null) {
                    currentLevel.add(rootNode.left);
                    currentVal.add(rootNode.left.value);
                }

                if (rootNode.right != null) {
                    currentLevel.add(rootNode.right);
                    currentVal.add(rootNode.right.value);
                }

            }

            if (currentVal.size() > 0){
                toReturn.add(currentVal);
            }

            queue = currentLevel;

        }


        return toReturn;
    }

    public static class TreeNode{
        public int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

}
