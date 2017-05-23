package interviewsKdn251.Company.Facebook;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16.04.2017.
 */
public class AddAndSearchWordDataStructureDesignSpec {
    @Test
    public void apiWordTesting() throws Exception {
        AddAndSearchWordDataStructureDesign.addWord("bad");
        AddAndSearchWordDataStructureDesign.addWord("dad");
        AddAndSearchWordDataStructureDesign.addWord("mad");
        AddAndSearchWordDataStructureDesign.addWord("");
        Assert.assertFalse(AddAndSearchWordDataStructureDesign.search("pad") );
        Assert.assertTrue(AddAndSearchWordDataStructureDesign.search("bad") );
        Assert.assertTrue(AddAndSearchWordDataStructureDesign.search(".ad") );
        Assert.assertTrue(AddAndSearchWordDataStructureDesign.search("m..") );
    }


}