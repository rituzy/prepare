import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by user on 14.04.2017.
 */
public class IteratorOfIteratorsSpec {
    @Test
    public void multipleIterators() {
        final Iterator<Integer> a = Arrays.asList(1, 2, 3, 4, 5).iterator();
        final Iterator<Integer> b = Arrays.asList(6).iterator();
        final Iterator<Integer> c = new ArrayList<Integer>().iterator();
        final Iterator<Integer> d = new ArrayList<Integer>().iterator();
        final Iterator<Integer> e = Arrays.asList(7, 8, 9).iterator();
        final Iterator<Integer> singleIterator =
                new IteratorOfIterators.ListIterator(Arrays.asList(a, b, c, d, e));
        assertTrue(singleIterator.hasNext());
        for (Integer i = 1; i <= 9; i++) {
            assertEquals(i, singleIterator.next());
        }
    }

}