package interviewsKdn251.Company.Airbnb;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.reducing;

/**
 * Created by user on 15.04.2017.
 */

// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

public class AddTwoNumbers {
    final private LinkedList<Integer> firstNumber;
    final private LinkedList<Integer> secondNumber;

    public AddTwoNumbers(LinkedList<Integer> firstNumber, LinkedList<Integer> secondNumber) {
        if (firstNumber == null || secondNumber == null){
            throw new IllegalArgumentException("args must be not a null");
        }

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    public LinkedList<Integer> addition(){

        Integer first = convert2Int(convert2String(firstNumber));
        Integer second = convert2Int(convert2String(secondNumber));
        Integer result = first + second;

        return convert2List(new StringBuilder(result.toString()));
    }

    public StringBuilder convert2String(LinkedList<Integer> intList){
        StringBuilder reversed = new StringBuilder(
                intList.stream().map(String::valueOf).collect(reducing( (s1, s2) -> s1 + s2)).get() );
        return reversed.reverse();
    }

    public Integer convert2Int(StringBuilder sb){
        return Integer.valueOf(sb.toString());
    }

    public LinkedList<Integer> convert2List(StringBuilder stringBuilder){

        char[] chars = stringBuilder.reverse().toString().toCharArray();

        Stream<Character> cStream = IntStream.range(0, chars.length).mapToObj(i -> chars[i]);


        List<Integer> toReturn = cStream.map(c -> Character.getNumericValue(c)).collect(Collectors.toList());

        return new LinkedList<>(toReturn);
    }

    public static Node addTwoNumbers(Node n1, Node n2){
        Node current1 = n1;
        Node current2 = n2;

        int sum = 0;

        Node head = new Node(0);
        Node currentHead = head;

        while(current1 != null || current2 != null){

            sum /= 10;

            if (current1 != null){
                sum += current1.val;
                current1 = current1.next;
            }

            if (current2 != null){
                sum += current2.val;
                current2 = current2.next;
            }

            currentHead.next = new Node(sum % 10);
            currentHead = currentHead.next;

        }

        if (sum / 10 == 1){
            currentHead.next = new Node(1);
        }

        return head.next;

    }

    public static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
}
