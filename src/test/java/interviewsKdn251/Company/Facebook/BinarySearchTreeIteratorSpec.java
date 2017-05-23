package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 17.04.2017.
 */
public class BinarySearchTreeIteratorSpec {
    @Test
    public void hasNextTest() throws Exception {
        BinarySearchTreeIterator.TreeNode root = new BinarySearchTreeIterator.TreeNode(10);
        root.left = new BinarySearchTreeIterator.TreeNode(6);
        root.right = new BinarySearchTreeIterator.TreeNode(14);

        BinarySearchTreeIterator bit = new BinarySearchTreeIterator(root);

        Assert.assertTrue(bit.hasNext());
    }

    @Test
    public void nextTest() throws Exception {
        BinarySearchTreeIterator.TreeNode root = new BinarySearchTreeIterator.TreeNode(10);
        root.left = new BinarySearchTreeIterator.TreeNode(6);
        root.right = new BinarySearchTreeIterator.TreeNode(14);
        root.left.left = new BinarySearchTreeIterator.TreeNode(3);
        root.left.right = new BinarySearchTreeIterator.TreeNode(8);
        root.left.left.left = new BinarySearchTreeIterator.TreeNode(1);
        root.left.left.left.right = new BinarySearchTreeIterator.TreeNode(2);

        BinarySearchTreeIterator bit = new BinarySearchTreeIterator(root);
        Assert.assertEquals(1, bit.next());
        Assert.assertEquals(2, bit.next());

    }

}