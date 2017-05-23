package interviewsKdn251.Company.LinkedIn;

import interviewsKdn251.Company.Amazon.ValidateBinarySearchTree;

import java.util.Stack;

/**
 * Created by user on 16.05.2017.
 */
public class BinarySearchTreeIterator {
    Stack<TreeNode> stack;

    public BinarySearchTreeIterator(TreeNode root) {

        stack = new Stack<>();

        while (root != null){
            stack.push(root);
            root = root.left;
        }

    }

    public boolean hasNext(){
        return !stack.isEmpty();
    }

    public Integer next(){
        /*example
        *       a
        *      / \
        *     b
        *    / \
        *   c   d
        *    \
        *     e
        *    / \
        *   f
        */
        // get c
        TreeNode smallest = stack.pop();
        // get e
        TreeNode nextSmallest = smallest.right;
        // pushing to stack until finding f
        while (nextSmallest != null){
            stack.push(nextSmallest);
            nextSmallest = nextSmallest.left;
        }
        //return c.val
        return smallest.val;
    }
}
