package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.05.2017.
 */
public class SymmetricTreeTest {
    @Test
    public void isSymmetric() throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(6);

        Assert.assertTrue(SymmetricTree.isSymmetric(root));
    }

}