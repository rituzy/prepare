package interviewsKdn251.Company.LinkedIn;

import interviewsKdn251.Company.Amazon.ValidateBinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by user on 16.05.2017.
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
    public static List<List<Integer>> traverse(TreeNode root){

        List<List<Integer>> toReturn = new ArrayList<>();

        // putting root node to head list and then result
        List<Integer> tempList = new ArrayList<>();
        tempList.add(root.val);
        toReturn.add(tempList);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Queue<TreeNode> currentLevel = new LinkedList<>();
            List<Integer> currentList = new ArrayList<>();

            while (!queue.isEmpty()) {
                TreeNode treeNode = queue.poll();

                if (treeNode.left != null){
                    currentLevel.add(treeNode.left);
                    currentList.add(treeNode.left.val);
                }

                if (treeNode.right != null){
                    currentLevel.add(treeNode.right);
                    currentList.add(treeNode.right.val);
                }
            }

            queue = currentLevel;
            if (currentList.size() > 0){
                toReturn.add(currentList);
            }

        }

        return toReturn;
    }

}
