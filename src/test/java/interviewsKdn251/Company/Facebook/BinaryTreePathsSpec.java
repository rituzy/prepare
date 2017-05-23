package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 17.04.2017.
 */
public class BinaryTreePathsSpec {
    @Test
    public void findPathFromRoot() throws Exception {
        BinaryTreePaths.TreeNode root = new BinaryTreePaths.TreeNode(1);
        root.left = new BinaryTreePaths.TreeNode(2);
        root.right = new BinaryTreePaths.TreeNode(3);
        root.left.right = new BinaryTreePaths.TreeNode(5);
        root.left.right.left = new BinaryTreePaths.TreeNode(6);
        List<String> actual = BinaryTreePaths.findPathFromRoot(root);
        System.out.println(actual);
        Assert.assertEquals("1 -> 2 -> 5 -> 6", actual.get(0));
        Assert.assertEquals("1 -> 3", actual.get(1));

    }

}