package interviewsKdn251.Company.coursera_algorithm;

/**
 * Created by user on 29.05.2017.
 * Merging with smaller auxiliary array. Suppose that the subarray a[0] to a[n−1] is sorted and the
 * subarray a[n] to a[2∗n−1] is sorted. How can you merge the two subarrays so that a[0] to a[2∗n−1]
 * is sorted using an auxiliary array of length n (instead of 2n)?
 */
public class MergeSubarrays {
    public static int[] mergeArrays(int[] a, int[] aux, int N){
        int indexA = N;
        int indexAux = 0;
        int indexRes = 0;

        for (int i = 0; i < N; i++){
            aux[i] = a[i];
        }

        while(indexRes < a.length){
            if (indexAux >= N){
                a[indexRes++] = a[indexA++];
            }else if (indexA >= a.length){
                a[indexRes++] = a[indexAux++];
            }else if (aux[indexAux] < a[indexA]){
                a[indexRes++] = aux[indexAux++];
            }else {
                a[indexRes++] = a[indexA++];
            }
        }

        return a;
    }
}
