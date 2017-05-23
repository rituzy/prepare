package interviewsKdn251.Company.LinkedIn;

/**
 * Created by user on 20.05.2017.
 */
public class Pow {
    public static double pow(double n, int k){

        if (k == 0){
            return  1;
        }

        if (Double.isInfinite(n)){
            return 0;
        }

        if (k < 0){
            n = 1 / n;
            k = -k;
        }

        return k % 2 == 0 ? pow(n * n, k / 2) : n * pow(n * n, k / 2) ;
    }
}
