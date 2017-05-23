package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Facebook.dfsf;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class ClosestBinarySearchTreeValueTest {
    @Test
    public void closestValue() throws Exception {
        TreeNode root = new TreeNode(100);
        root.left = new TreeNode(50);
        root.right = new TreeNode(200);
        root.right.right = new TreeNode(400);
        root.right.left = new TreeNode(150);

        Assert.assertEquals(150, ClosestBinarySearchTreeValue.closestValue(root, 170));
    }

}