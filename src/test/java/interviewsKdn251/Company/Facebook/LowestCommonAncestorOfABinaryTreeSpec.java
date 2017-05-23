package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 20.04.2017.
 */
public class LowestCommonAncestorOfABinaryTreeSpec {

    @Test
    public void findAncestorTest() throws Exception {
        LowestCommonAncestorOfABinaryTree.TreeNode root = new LowestCommonAncestorOfABinaryTree.TreeNode(10);
        root.right  = new LowestCommonAncestorOfABinaryTree.TreeNode(20);
        root.left = new LowestCommonAncestorOfABinaryTree.TreeNode(5);
        root.left.left = new LowestCommonAncestorOfABinaryTree.TreeNode(2);
        root.left.left.right = new LowestCommonAncestorOfABinaryTree.TreeNode(3);
        root.left.left.left = new LowestCommonAncestorOfABinaryTree.TreeNode(1);

        Assert.assertEquals(10, LowestCommonAncestorOfABinaryTree.findAncestor(root, root.left ,
                root.right).val);

    }

}