package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class MaximumDepthOfABinaryTreeTest {
    @Test
    public void getMaxLenTreeTest() throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        Assert.assertEquals(4,
                MaximumDepthOfABinaryTree.getMaxLenTree(root) );
    }

}