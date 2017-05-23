package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class dfsfTest {
    @Test
    public void binaryVerticalOrderTraversal() throws Exception {
        dfsf.TreeNode root = new dfsf.TreeNode(1);
        root.left = new dfsf.TreeNode(2);
        root.right = new dfsf.TreeNode(3);
        root.left.right = new dfsf.TreeNode(5);

        System.out.println(dfsf.binaryVerticalOrderTraversal(root));
    }

    @Test
    public void binaryTreePathsTest() throws Exception {
        dfsf.TreeNode root = new dfsf.TreeNode(1);
        root.left = new dfsf.TreeNode(2);
        root.right = new dfsf.TreeNode(3);
        root.left.right = new dfsf.TreeNode(5);

        System.out.println(dfsf.binaryTreePaths(root));
    }

    @Test
    public void selfProdArray() throws Exception {
        int[] src = {1,2,3,4};
        int[] expected = {24,12,8,6};

        Assert.assertArrayEquals(expected, dfsf.selfProdArray(src) );
    }

}