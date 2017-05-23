package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 22.04.2017.
 */
public class SumOfLeftLeavesTest {
    @Test
    public void leftLeafsSumTest() throws Exception {
        SumOfLeftLeaves.TreeNode root = new SumOfLeftLeaves.TreeNode(3);
        root.left = new SumOfLeftLeaves.TreeNode(9);
        root.right = new SumOfLeftLeaves.TreeNode(20);
        root.right.left = new SumOfLeftLeaves.TreeNode(15);
        root.right.right = new SumOfLeftLeaves.TreeNode(7);

        Assert.assertEquals(24, SumOfLeftLeaves.leftLeafsSum(root));
    }

}