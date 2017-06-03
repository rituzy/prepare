package interviewsKdn251.Company.coursera_algorithm;

/**
 * Created by user on 31.05.2017.
 * Selection in two sorted arrays. Given two sorted arrays a[] and b[], of sizes n1 and n2, respectively, design an algorithm to find the kth largest key. The order of growth of the worst case running time of your algorithm should be logn, where n=n1+n2.

 Version 1: n1=n2 and k=n/2
 Version 2: k=n/2
 Version 3: no restrictions
 */
public class KthElement2Arrays {
    static int midOfArray1;
    static int midOfArray2;

    public static int KthSmallestIn2SortedArrays(int[] array1, int[] array2, int start1,
                                          int end1, int start2, int end2, int k){
      /* If array1 is empty */
        if (array1.length == 0)
            return array2[k];
      /* If array2 is empty */
        else if (array2.length == 0)
        return array1[k];

        midOfArray1 = array1.length/2;
        midOfArray2 = array2.length/2;

    /* When the summation of middle index of both the arrays is smaller than k*/
        if((midOfArray1 + midOfArray2)  <  k){
        /* When middle element of first array is larger than the second array */
            if(array1[midOfArray1] > array2[midOfArray2])
                return KthSmallestIn2SortedArrays(array1, array2, start1, end1,
                        midOfArray2+1, end2, k-midOfArray2-1);
            else
                return KthSmallestIn2SortedArrays(array1, array2, midOfArray1+1,
                        end1, start2, end2, k-midOfArray1-1);
        }

    /* When the summation of middle index of both the arrays is larger than k*/
        else{
        /* When middle element of first array is larger than the second array */
            if(array1[midOfArray1] > array2[midOfArray2])
                return KthSmallestIn2SortedArrays(array1, array2, start1,
                        midOfArray1, start2, end2, k);
            else
                return KthSmallestIn2SortedArrays(array1, array2, start1,
                        end1, start2, midOfArray2, k);
        }
    }


}
