package interviewsKdn251.Company.Facebook;

/**
 * Created by user on 17.04.2017.
 */
public class AddBinary {
    public static String addBinary(String a, String b){
        StringBuilder toReturn = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carrier = 0;

        while (i >=0 || j >= 0){
            int sum = carrier;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            toReturn.append(sum%2);
            carrier = sum/2;
        }

        if (carrier > 0){
            toReturn.append(carrier);
        }

        return toReturn.reverse().toString();
    }
}
