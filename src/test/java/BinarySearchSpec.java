import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 09.04.2017.
 */
public class BinarySearchSpec {
    private final static int[] TEST_ARRAY = new int[]{5,2,6,1,0,-1,3,88,-99};
    BinarySearch binarySearch;

    @Before
    public void setup(){
        binarySearch = new BinarySearch(TEST_ARRAY);
    }

    @Test
    public void givenArrayWhenNoFoundThenFalse(){
        boolean result = binarySearch.search(66);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenArrayWhenFoundThenTrue(){
        boolean result = binarySearch.search(-1);
        Assert.assertEquals(true, result);
    }

}
