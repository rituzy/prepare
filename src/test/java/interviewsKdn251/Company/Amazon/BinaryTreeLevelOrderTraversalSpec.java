package interviewsKdn251.Company.Amazon;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class BinaryTreeLevelOrderTraversalSpec {
    @Test
    public void getTreeAsListTest() throws Exception {
        BinaryTreeLevelOrderTraversal.TreeNode node = new BinaryTreeLevelOrderTraversal.TreeNode(11);
        node.left = new BinaryTreeLevelOrderTraversal.TreeNode(10);
        node.left.left = new BinaryTreeLevelOrderTraversal.TreeNode(9);
        node.left.right = new BinaryTreeLevelOrderTraversal.TreeNode(12);
        node.right = new BinaryTreeLevelOrderTraversal.TreeNode(21);
        node.right.left = new BinaryTreeLevelOrderTraversal.TreeNode(16);
        node.right.right = new BinaryTreeLevelOrderTraversal.TreeNode(30);
        node.right.left.right = new BinaryTreeLevelOrderTraversal.TreeNode(18);
        node.right.right.left = new BinaryTreeLevelOrderTraversal.TreeNode(27);

        List<List<Integer>> traversed = BinaryTreeLevelOrderTraversal.getTreeAsList(node);
        for (List<Integer> l : traversed){
            System.out.println(l);
        }
    }

}