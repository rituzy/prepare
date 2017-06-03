package interviewsKdn251.Company.coursera_algorithm;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by user on 28.05.2017.
 */
public class Queue2Stacks<Item> {
    private Stack<Item> inbox;
    private Stack<Item> outbox;

    public Queue2Stacks()
    {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }

    public boolean isEmpty()
    {
        return outbox.isEmpty() && inbox.isEmpty();
    }

    public int size()
    {
        return outbox.size() + inbox.size();
    }

    public void enqueue(Item item)
    {
        if (item == null)
            throw new NullPointerException();

        inbox.push(item);
    }

    public Item deque()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }

        if (!outbox.isEmpty()){
            return outbox.pop();
        }

        while (!inbox.isEmpty())
        {
            outbox.push(inbox.pop());
        }

        return outbox.pop();

    }


}
