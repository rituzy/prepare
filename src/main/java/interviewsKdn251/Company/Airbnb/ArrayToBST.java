package interviewsKdn251.Company.Airbnb;

/**
 * Created by user on 15.04.2017.
 */
// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
public class ArrayToBST {

    public static TreeBST arrayToBST(int[] arr){

        if (arr.length == 0)
            return null;

        return createTree(arr, 0, arr.length - 1);

    }

    private static TreeBST createTree(int[] arr, int start, int end){
        if (start <= end) {
            int mid = start + (end - start) / 2;

            TreeBST head = new TreeBST(arr[mid]);
            head.left = createTree(arr, start, mid - 1);
            head.right = createTree(arr, mid + 1, end);

            return head;
        }

        return null;

    }

    public static class TreeBST{
        int val;
        TreeBST left;
        TreeBST right;

        public TreeBST(int val) {
            this.val = val;
        }
    }
}
