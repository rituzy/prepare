package interviewsKdn251.Company.Google;

/**
 * Created by user on 06.05.2017.
 */
// Given a nested list of integers, implement an iterator to flatten it.

// Each element is either an integer, or a list -- whose elements may also be integers or other lists.

// Example 1:
// Given the list [[1,1],2,[1,1]],

// By calling next repeatedly until hasNext returns false, the order of elements returned by next
// should be: [1,1,2,1,1].

// Example 2:
// Given the list [1,[4,[6]]],

// By calling next repeatedly until hasNext returns false, the order of elements returned
// by next should be: [1,4,6].

import interviewsKdn251.Company.Facebook.MergeIntervals;

import java.util.List;
import java.util.Stack;

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

    private Stack<interviewsKdn251.Company.Facebook.FlattenNestedListIterator.NestedInteger> stack;

    public FlattenNestedListIterator(
            List<interviewsKdn251.Company.Facebook.FlattenNestedListIterator.NestedInteger> nestedIntegerList) {
        for (int i = nestedIntegerList.size() - 1; i >= 0; i--){
            stack.push(nestedIntegerList.get(i));
        }
    }

    public Integer next(){
        return stack.pop().getInteger();
    }

    public boolean hasNext(){

        while (!stack.isEmpty()){

            interviewsKdn251.Company.Facebook.FlattenNestedListIterator.NestedInteger current =
                    stack.peek();

            if (current.isInteger()) return true;

            stack.pop();

            for (int i = current.getList().size() - 1; i >= 0; i--) {
                stack.push(current.getList().get(i));
            }

        }

        return false;
    }

}
