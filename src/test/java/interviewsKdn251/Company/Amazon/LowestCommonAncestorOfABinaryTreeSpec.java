package interviewsKdn251.Company.Amazon;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class LowestCommonAncestorOfABinaryTreeSpec {
    @Test
    public void getLCAofBTTest() throws Exception {
        LowestCommonAncestorOfABinaryTree.TreeNode root = new LowestCommonAncestorOfABinaryTree.TreeNode(3);
        root.left = new LowestCommonAncestorOfABinaryTree.TreeNode(5);
        root.left.left = new LowestCommonAncestorOfABinaryTree.TreeNode(6);
        root.left.right = new LowestCommonAncestorOfABinaryTree.TreeNode(2);
        root.left.right.left = new LowestCommonAncestorOfABinaryTree.TreeNode(7);
        root.left.right.right = new LowestCommonAncestorOfABinaryTree.TreeNode(4);
        root.right = new LowestCommonAncestorOfABinaryTree.TreeNode(1);
        root.right.left = new LowestCommonAncestorOfABinaryTree.TreeNode(0);
        root.right.right = new LowestCommonAncestorOfABinaryTree.TreeNode(8);

        Assert.assertEquals(3,
                LowestCommonAncestorOfABinaryTree.getLCAofBT(root, root.left, root.right).val);
        Assert.assertEquals(5,
                LowestCommonAncestorOfABinaryTree.getLCAofBT(root, root.left, root.left.right.right ).val);
    }

}