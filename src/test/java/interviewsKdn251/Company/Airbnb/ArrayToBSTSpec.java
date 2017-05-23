package interviewsKdn251.Company.Airbnb;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by user on 15.04.2017.
 */
public class ArrayToBSTSpec {
    @Test
    public void arrayToBST() throws Exception {

        int[] src = IntStream.rangeClosed(0,9).toArray();
        ArrayToBST.TreeBST actual = ArrayToBST.arrayToBST(src);

        assertEquals(4, actual.val);
        assertEquals(7, actual.right.val);
        assertEquals(1, actual.left.val);
        assertEquals(5, actual.right.left.val);
        assertEquals(0, actual.left.left.val);

        printTree(actual);
    }

    private void printTree(ArrayToBST.TreeBST tree){
        if (tree == null) return;

        System.out.println(tree.val);

        System.out.println("right");
        printTree(tree.right);

        System.out.println("left");
        printTree(tree.left);
    }

}