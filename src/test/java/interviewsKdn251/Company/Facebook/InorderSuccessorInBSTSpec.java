package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19.04.2017.
 */
public class InorderSuccessorInBSTSpec {
    @Test
    public void getSuccessorTest() throws Exception {
        InorderSuccessorInBST.TreeNode root = new InorderSuccessorInBST.TreeNode(10);
        root.right = new InorderSuccessorInBST.TreeNode(20);
        root.left = new InorderSuccessorInBST.TreeNode(6);
        root.left.left = new InorderSuccessorInBST.TreeNode(3);
        root.left.right = new InorderSuccessorInBST.TreeNode(8);
        root.left.left.right = new InorderSuccessorInBST.TreeNode(5);
        root.left.left.left = new InorderSuccessorInBST.TreeNode(1);

        Assert.assertEquals(3, InorderSuccessorInBST.getSuccessor(root, root.left.left.left).val);
    }

}