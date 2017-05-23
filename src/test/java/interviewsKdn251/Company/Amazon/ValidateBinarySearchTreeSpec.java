package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class ValidateBinarySearchTreeSpec {
    @Test
    public void isValidTree() throws Exception {
        ValidateBinarySearchTree.TreeNode rootTrue = new ValidateBinarySearchTree.TreeNode(2);
        rootTrue.left = new ValidateBinarySearchTree.TreeNode(1);
        rootTrue.right = new ValidateBinarySearchTree.TreeNode(3);

        ValidateBinarySearchTree.TreeNode rootFalse = new ValidateBinarySearchTree.TreeNode(1);
        rootFalse.left = new ValidateBinarySearchTree.TreeNode(3);
        rootFalse.right = new ValidateBinarySearchTree.TreeNode(2);

        Assert.assertTrue(ValidateBinarySearchTree.isValidTree(rootTrue));
        Assert.assertFalse(ValidateBinarySearchTree.isValidTree(rootFalse));

    }

}