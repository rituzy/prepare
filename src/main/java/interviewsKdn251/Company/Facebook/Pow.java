package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 22.04.2017.
 */
// Implement pow(x, n).
public class Pow {

    public static int pow(int num, int p){
        if (num == 0) return 0;
        if (p == 0) return 1;
        if (p == 1) return num;

        if (p < 0){
            p = -p;
            num = 1/num;
        }

        return p % 2 == 0 ? pow(num*num, p/2):num * pow(num*num, p/2);
    }
}
