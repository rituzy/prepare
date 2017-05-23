package interviewsKdn251.Company.LinkedIn;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 16.05.2017.
 */
public class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void traverseTest() throws Exception {
        TreeNode node = new TreeNode(11);
        node.left = new TreeNode(10);
        node.left.left = new TreeNode(9);
        node.left.right = new TreeNode(12);
        node.right = new TreeNode(21);
        node.right.left = new TreeNode(16);
        node.right.right = new TreeNode(30);
        node.right.left.right = new TreeNode(18);
        node.right.right.left = new TreeNode(27);

        List<List<Integer>> traversed = BinaryTreeLevelOrderTraversal.traverse(node);
        for (List<Integer> l : traversed){
            System.out.println(l);
        }
    }

}