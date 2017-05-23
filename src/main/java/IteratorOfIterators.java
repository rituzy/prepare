import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 14.04.2017.
 */

public class IteratorOfIterators<T>{

    public static class ListIterator<T> implements Iterator<T> {
        private final Iterator<Iterator<T>> listIterator;
        private Iterator<T> currentIterator;

        public ListIterator(List<Iterator<T>> iterators) {
            this.listIterator = iterators.iterator();
            this.currentIterator = listIterator.next();
        }

        public boolean hasNext() {
            if (!currentIterator.hasNext()) {
                if (!listIterator.hasNext()) {
                    return false;
                }
                currentIterator = listIterator.next();
                hasNext();
            }
            return true;
        }

        public T next(){
            hasNext();
            return currentIterator.next();
        }

        public void remove() {
            hasNext();
            currentIterator.remove();
        }

    }
}