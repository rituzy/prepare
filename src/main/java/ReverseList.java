/**
 * Created by user on 13.04.2017.
 */
public class ReverseList<T> {

    public static <T> LinkedList<T> reverse(final LinkedList<T> original){
        if (original == null){
            throw new IllegalArgumentException("original list must be not null!");
        }

        if (original.next == null){
            return original;
        }

        LinkedList<T> next = original.getNext();
        original.next = null;

        LinkedList<T> reversed = reverse(next);

        next.next = original;

        return reversed;

    }

    public static class LinkedList<T>{
        private T element;
        private LinkedList<T> next;

        public LinkedList(T element, LinkedList<T> next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public LinkedList<T> getNext() {
            return next;
        }
    }
}
