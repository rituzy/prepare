package interviewsKdn251.Company.LinkedIn;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 16.05.2017.
 */
public class BinarySearchTreeIteratorTest {
    @Test
    public void hasNextTest() throws Exception {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(6);
        root.right = new TreeNode(14);

        BinarySearchTreeIterator bit = new BinarySearchTreeIterator(root);

        Assert.assertTrue(bit.hasNext());
    }

    @Test
    public void nextTest() throws Exception {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(6);
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.left.left.left = new TreeNode(1);
        root.left.left.left.right = new TreeNode(2);

        BinarySearchTreeIterator bit = new BinarySearchTreeIterator(root);
        Assert.assertEquals(new Integer(1), bit.next());
        Assert.assertEquals(new Integer(2), bit.next());

    }
}