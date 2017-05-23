package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Facebook.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 08.05.2017.
 */
public class ImplementTrieTest {

    ImplementTrie itr = new ImplementTrie();

    @Test
    public void insertTest() throws Exception {
        itr.insert("one");
        itr.insert("two");
        itr.insert("three");

    }

    @Test
    public void searchTest() throws Exception {
        itr.insert("one");
        itr.insert("two");
        itr.insert("three");

        Assert.assertTrue(itr.search("one"));
        Assert.assertTrue(itr.search("three"));
        Assert.assertFalse(itr.search("four"));

    }

    @Test
    public void startsWithTest() throws Exception {
        itr.insert("one");
        itr.insert("two");
        itr.insert("three");

        Assert.assertTrue(itr.startsWith("on"));
        Assert.assertTrue(itr.startsWith("tw"));
        Assert.assertFalse(itr.startsWith("fo"));
    }

}