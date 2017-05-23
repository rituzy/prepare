package sort;

/**
 * Created by user on 09.04.2017.
 */
public class HeapSort extends CommonSort {
    public int[] sort(int[] numbers) {
        MaxPQ<Integer> pq = new MaxPQ<Integer>(numbers.length);
        for(int i : numbers){
            pq.insert(i);
        }

        for (int i = numbers.length - 1; i >= 0; i--){
            numbers[i] = pq.delMax();
        }

        return numbers;
    }

    private class MaxPQ< Key extends Comparable<Key> >{
        private Key[] pq;
        private int N = 0;

        public MaxPQ(int maxN) {
            pq = (Key[]) new Comparable[maxN + 1];
        }

        public boolean isEmpty(){
            return N == 0;
        }

        public int size(){
            return N;
        }

        public void insert(Key v){
            pq[++N] = v;
            swim(N);
        }

        public Key delMax(){
            Key max = pq[1];
            exch(1, N--);
            pq[N+1] = null;
            sink(1);
            return max;
        }

        private boolean less(int i, int j){
            if (pq[i].compareTo(pq[j]) < 0) return true;
            return  false;
        }

        private void exch(int i, int j){
            Key temp = pq[i];
            pq[i] = pq[j];
            pq[j] = temp;
        }

        private void swim(int k){
            while (k > 1 && less(k/2, k)){
                exch(k, k/2);
                k = k/2;
            }
        }

        private void sink(int k){
            while (2 * k <= N){
                int j = 2*k;
                if (j < N && less(j, j + 1)) j++;
                if (!less(k, j)) break;
                exch(k, j);
                k = j;
            }
        }
    }
}
