package interviewsKdn251.Company.twitter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 21.05.2017.
 */
public class LowestCommonAncestorOfABinaryTreeTest {
    @Test
    public void findLowesAncestorTest() throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        Assert.assertEquals(3,
                LowestCommonAncestorOfABinaryTree.findLowesAncestor(root, root.left, root.right).val);
        Assert.assertEquals(5,
                LowestCommonAncestorOfABinaryTree.findLowesAncestor(root, root.left, root.left.right.right).val);
    }

}