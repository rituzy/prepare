package interviewsKdn251.Company.coursera_algorithm;

/**
 * Created by user on 30.05.2017.
 */
public class CountingInversions {
    static int mergeSort(int arr[], int sz){
        int[] aa = new int[sz];
        return recMergeSort(arr, aa, 0, sz-1);
    }

    static int recMergeSort(int[] arr, int[] aux, int left, int right){
        int mid, invCnt = 0;

        if (right > left){
            mid = (right + left)/2;

            invCnt += recMergeSort(arr, aux, left, mid);
            invCnt += recMergeSort(arr, aux, mid+1, right);

            invCnt += merge(arr,aux,left,mid+1,right);
        }

        return invCnt;

    }

    static int merge(int[] arr, int[] aux, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;

        int invCnt = 0;

        while (i <= mid - 1 && j <= right) {
            if (arr[i] < arr[j]) {
                aux[k++] = arr[j++];
            } else {
                aux[k++] = arr[i++];
                invCnt += (mid - i);
            }

        }
        while (i <= mid - 1)
            aux[k++] = arr[i++];

        while (j < right)
            aux[k++] = arr[j++];

        for (i = left; i <= right; i++)
            arr[i] = aux[i];

        return invCnt;
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println(" Number of inversions are " +  mergeSort(arr, 5));

    }

}
