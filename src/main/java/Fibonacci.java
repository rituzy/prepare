import java.util.*;

/**
 * Created by user on 10.04.2017.
 */
public class Fibonacci {

    private static Map<Integer, Integer> fibCache = new HashMap<Integer, Integer>();

    public static List<Integer> getFibList(int n){
        if (n < 0){
            throw new IllegalArgumentException("n must be positive o zero!");
        }

        if (n == 0){
            return new ArrayList<Integer>();
        }

        if (n == 1){
            return Arrays.asList(0);
        }

        if (n == 2){
            return Arrays.asList(0 , 1);
        }

        ArrayList<Integer> toRetrun = new ArrayList<Integer>();
        toRetrun.add(0);
        n--;
        toRetrun.add(1);
        n--;

        while(n > 0){
            Integer a = toRetrun.get(toRetrun.size() - 1 );
            Integer b = toRetrun.get(toRetrun.size() - 2 );
            toRetrun.add(a + b);
            n--;
        }

        return toRetrun;

    }

    public static int getFibNum(int n){
        if (n < 0){
            throw new IllegalArgumentException("n must be positive o zero!");
        }

        fibCache.put(0, 0);
        fibCache.put(1, 1);


        return recursiveFibNum(n);

    }

    private static int recursiveFibNum(int n){
        if (fibCache.containsKey(n)){
            return fibCache.get(n);
        }

        int value = recursiveFibNum(n - 1) + recursiveFibNum( n - 2);
        fibCache.put(n, value);
        return value;
    }
}
