package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19.04.2017.
 */
public class ImplementTrieSpec {
    @Test
    public void insertNsearchTest() throws Exception {
        ImplementTrie.insert("bug");
        ImplementTrie.insert("fix");
        Assert.assertTrue(ImplementTrie.search("bug"));
    }



}