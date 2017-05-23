package interviewsKdn251.Company.Facebook;

import interviewsKdn251.Company.Amazon.BinaryTreeLevelOrderTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 17.04.2017.
 */
public class BinaryTreeVerticalOrderTraversalSpec {
    @Test
    public void getTraversedTreeTest() throws Exception {
        BinaryTreeVerticalOrderTraversal.TreeNode root = new BinaryTreeVerticalOrderTraversal.TreeNode(3);
        root.left = new BinaryTreeVerticalOrderTraversal.TreeNode(9);
        root.right = new BinaryTreeVerticalOrderTraversal.TreeNode(20);
        root.right.left = new BinaryTreeVerticalOrderTraversal.TreeNode(15);
        root.right.right = new BinaryTreeVerticalOrderTraversal.TreeNode(7);

        List<List<Integer>> list = BinaryTreeVerticalOrderTraversal.getTraversedTree(root);
        System.out.print(list);
        Assert.assertEquals(9, (int)list.get(0).get(0));
        Assert.assertEquals(20, (int)list.get(2).get(0));
        Assert.assertEquals(7, (int)list.get(3).get(0));
        Assert.assertEquals(2, list.get(1).size());

    }

}