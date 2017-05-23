package interviewsKdn251.Company.twitter;

/**
 * Created by user on 21.05.2017.
 */
// Given a nested list of integers, implement an iterator to flatten it.

// Each element is either an integer, or a list -- whose elements may also be integers or other lists.

// Example 1:
// Given the list [[1,1],2,[1,1]],

// By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

// Example 2:
// Given the list [1,[4,[6]]],

// By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].

import java.util.List;
import java.util.Stack;
import interviewsKdn251.Company.Facebook.FlattenNestedListIterator.NestedInteger;
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class FlattenNestedListIterator {
    private Stack<NestedInteger> stack;

    public FlattenNestedListIterator(List<NestedInteger> ni) {
        stack = new Stack<>();

        for (int i = ni.size() - 1 ; i >= 0 ; i-- ){
            stack.push(ni.get(i));
        }
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public Integer next(){
        return stack.pop().getInteger();
    }

    public boolean hasNext(){
        while (!stack.isEmpty()) {
            NestedInteger next = stack.peek();
            if (next.isInteger()) return true;

            stack.pop();
            for (int i = next.getList().size() - 1; i >= 0; i--){
                stack.push(next.getList().get(i));
            }
        }

        return false;

    }




}
