package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23.04.2017.
 */
public class ValidBSTTest {
    @Test
    public void isValidBSTRecTest() throws Exception {
        ValidBST.TreeNode rootTrue = new ValidBST.TreeNode(2);
        rootTrue.left = new ValidBST.TreeNode(1);
        rootTrue.right = new ValidBST.TreeNode(3);

        ValidBST.TreeNode rootFalse = new ValidBST.TreeNode(1);
        rootFalse.left = new ValidBST.TreeNode(2);
        rootFalse.right = new ValidBST.TreeNode(3);

        Assert.assertTrue(ValidBST.isValidBSTRec(rootTrue));
        Assert.assertFalse(ValidBST.isValidBSTRec(rootFalse));
    }

    @Test
    public void isValidBSTTest() throws Exception {
        ValidBST.TreeNode rootTrue = new ValidBST.TreeNode(2);
        rootTrue.left = new ValidBST.TreeNode(1);
        rootTrue.right = new ValidBST.TreeNode(3);

        ValidBST.TreeNode rootFalse = new ValidBST.TreeNode(1);
        rootFalse.left = new ValidBST.TreeNode(2);
        rootFalse.right = new ValidBST.TreeNode(3);

        Assert.assertTrue(ValidBST.isValidBST(rootTrue));
        Assert.assertFalse(ValidBST.isValidBST(rootFalse));
    }

}