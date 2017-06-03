package interviewsKdn251.Company.coursera_algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by user on 29.05.2017.
 */
public class MergeSubarraysTest {
    @Test
    public void mergeArraysTest() throws Exception {
        int[] a = {40, 61, 70, 71, 99, 20, 51, 55, 75, 100};
        MergeSubarrays m = new MergeSubarrays();
        int N = a.length / 2;
        int[] aux = new int[N];
        m.mergeArrays(a, aux, N);
        System.out.println("After merging:");
        Arrays.stream(a).forEach((c) -> System.out.print(c + ","));
        System.out.println();
    }

}