/**
 * Created by user on 13.04.2017.
 */
public class ReverseString {

    public static String Reverse(String str){
        StringBuilder toReturn = new StringBuilder();
        for (int i = str.length() - 1; i >=0 ; i--){
            toReturn.append(str.charAt(i));
        }
        return toReturn.toString();
    }

    public static String ReverseUsingLib(String str){
        return  new StringBuffer(str).reverse().toString();
    }

}
