/**
 * Created by user on 10.04.2017.
 */
public class Factorial {

    public static long factorialCycle(int n){
        if (n < 0){
            throw new IllegalArgumentException("n must be positive");
        }

        if (n == 0 || n == 1){
            return 1L;
        }

        long toReturn = 1;
        for (int i = 1; i <= n; i++){
            toReturn *= i;
        }

        return toReturn;
    }

    public static long factorialRecursive(int n){
        if (n < 0){
            throw new IllegalArgumentException("n must be positive");
        }

        if (n == 0 || n == 1){
            return 1L;
        }

        return factorialRecursive(n-1) * n;
    }




}
