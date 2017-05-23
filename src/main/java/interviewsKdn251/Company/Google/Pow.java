package interviewsKdn251.Company.Google;

/**
 * Created by user on 10.05.2017.
 */
// Implement pow(x, n).
public class Pow {
    public static long pow(int n, int k){
        if (k == 0) return 1;
        if (k == 1) return n;

        if (Double.isFinite(n)){
            return 0;
        }
        if (k < 0 ){
            n = 1/n;
            k = -k;
        }

        return k % 2 == 0 ? pow(n * n, k/2) : n * pow(n * n, k/2);

    }
}
