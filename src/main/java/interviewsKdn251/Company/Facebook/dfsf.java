package interviewsKdn251.Company.Facebook;

import interviewsKdn251.Company.Amazon.MergeKSortedLists;
import interviewsKdn251.Company.Amazon.ValidateBinarySearchTree;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created by user on 19.04.2017.
 */
public class dfsf {
    public static List<List<String>> groupAnagrams(String[] anagrams){

        Map<String, List<String>> keyWord = new HashMap<>();

        for (String str : anagrams){

            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = chars.toString();
            if (!keyWord.containsKey(key)){
                keyWord.put(key, new ArrayList<String>());
            }
            keyWord.get(key).add(str);
        }

        return new ArrayList<>(keyWord.values());

    }
// Given a digit string, return all possible letter combinations that the number could represent.

// A mapping of digit to letters (just like on the telephone buttons) is given below.

// 2 - abc
// 3 - def
// 4 - ghi
// 5 - jkl
// 6 - mno
// 7 - pqrs
// 8 - tuv
// 9 - wxyz

// Input:Digit string "23"
// Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

    public static List<String> getPhoneCombinations(String num){
        LinkedList<String> toReturn = new LinkedList<>();
        String[] digits = {"0", "1", "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};

        toReturn.add("");

        for (int i = 0; i < num.length(); i++){

            int index = Character.getNumericValue(num.charAt(i));

            while (toReturn.peek().length() == i){
                String current = toReturn.remove();
                for (int j = 0; j < digits[index].length(); j++) {
                    toReturn.add(current + digits[index].charAt(j));
                }
            }
        }

        System.out.println(toReturn);
        return toReturn;

    }

    public static MergeKSortedLists.ListNode mergeKSortedLists(MergeKSortedLists.ListNode[] list){
        PriorityQueue<MergeKSortedLists.ListNode> queue = new PriorityQueue<>(new Comparator<MergeKSortedLists.ListNode>() {
            @Override
            public int compare(MergeKSortedLists.ListNode o1, MergeKSortedLists.ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (MergeKSortedLists.ListNode node : list){
            if (node != null)
                queue.add(node);
        }

        MergeKSortedLists.ListNode head = new MergeKSortedLists.ListNode(0);
        MergeKSortedLists.ListNode current = head;

        while (!queue.isEmpty()){
            current.next = queue.poll();
            current = current.next;

            if (current.next != null){
                queue.add(current.next);
            }
        }

        return head.next;


    }

    public static int numOfIslands(int[][] map){
        int[][] toSink = new int[map.length][map[0].length];
        System.arraycopy(map,0,toSink, 0, map.length);

        int toReturn = 0;

        for (int i = 0; i < toSink.length; i++){
            for (int j = 0; j < toSink[0].length; j++){
                toReturn = sink(toSink, i, j);
            }
        }

        return toReturn;

    }

    private static int sink(int[][] map, int i, int j){
        if (i < 0 || i >= map.length || j < 0 || j >= map[0].length || map[i][j] == '0' ){
            return 0;
        }
        //sink current cell
        map[i][j] = '0';

        // sink neighbours
        sink(map, i+1, j);
        sink(map, i - 1, j);
        sink(map, i, j+1);
        sink(map, i, j - 1);


        return 1;

    }

    public static boolean isPalindrome(ListNode head){

        ListNode fast = head;
        ListNode slow = head;
        Stack<Integer> stack = new Stack<>();

        while(fast != null && fast.next != null){
            stack.push(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null){
            slow = slow.next;
        }

        while(slow != null){
            if (stack.pop() != slow.val) return false;
            slow = slow.next;
        }

        return true;
    }

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static int[] selfProdArray(int[] numbers){
        int left = 1;
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++){
            if (i > 0){
                left *= numbers[i - 1];
            }
            result[i] = left;
        }

        int right = 1;

        for (int i = numbers.length -1; i >=0; i--){
            if (i < numbers.length - 1){
                right *= numbers[i + 1];
            }

            result[i] *= right;
        }

        return result;
    }

    public static boolean isMatch(String s, String p) {
        if (p.length() == 0)
            return s.length() == 0;

        //special case for first character
        if (p.length() == 1){
            if (s.length() < 1 || (p.charAt(0) != '*' && p.charAt(0) != s.charAt(0))){
                return false;
            }else{
                return isMatch(s.substring(1), p.substring(1));
            }

        }
        // common case when pattern does not contain *
        if (p.charAt(0) != '*'){
            if (s.length() < 1 || (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0))){
                return false;
            }else{
                return isMatch(s.substring(1), p.substring(1));
            }
        }else{
            if (isMatch(s, p.substring(2))){
                return true;
            }
            int i =0;
            // looking for the any matching part at the rest of the string(after *)
            while (i < s.length() && (p.charAt(i) == s.charAt(i) || p.charAt(i) == '.')){
                if ( isMatch(s.substring(i + 1), p.substring(2)) ){
                    return true;
                }
                i++;
            }

            return false;
        }


    }

    public static ListNode reverseLinkedList(ListNode head){

        ListNode newHead = null;


        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }

    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isValidarentheses(String s){

        Stack<Character> stack = new Stack<>();

        for (int i = 0 ; i < s.length(); i++){
            if ( s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) =='{' ){
                stack.push(s.charAt(i));
            }

            if ( s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() != '{') {
                stack.pop();
            }else if ( s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() != '[') {
                stack.pop();
            }else if ( s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() != '(') {
                stack.pop();
            }else{
                return false;
            }
        }

        return stack.isEmpty();

    }

    public static ArrayList<String> binaryTreePaths(TreeNode root){
        ArrayList<String> res = new ArrayList<>();
        if (root == null) return res;
        recBinaryTreePaths(res, "", root);
        return res;
    }

    private static void recBinaryTreePaths(ArrayList<String> result, String path, TreeNode root){
        // condition of leaf node: when yes, add to result
        if (root.left == null && root.right == null){
            result.add(path + root.val);
        }

        if (root.left != null) {
            recBinaryTreePaths(result, path + root.val + "->", root.left);
        }

        if (root.right != null) {
            recBinaryTreePaths(result, path + root.val + "->", root.right);
        }

    }

    public static List<List<Integer>> binaryVerticalOrderTraversal(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> cols = new LinkedList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        List<List<Integer>> result =  new ArrayList<>();

        int top = 0;
        int bottom = 0;

        queue.add(root);
        cols.add(0);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            int col = cols.poll();

            if (!map.containsKey(col)){
                map.put(col, new ArrayList<Integer>());
            }

            map.get(col).add(current.val);

            if (current.right != null){
                queue.add(current.right);
                cols.add(col + 1);
                top = Math.max(top, col + 1);
            }

            if (current.left != null){
                queue.add(current.left);
                cols.add(col - 1);
                bottom = Math.min(top, col - 1);
            }

        }

        for (int i = bottom; i <= top; i++){
            result.add(map.get(i));
        }

        return result;

    }

}
