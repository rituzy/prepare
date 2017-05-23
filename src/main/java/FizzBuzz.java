/**
 * Created by user on 10.04.2017.
 */
public class FizzBuzz {
    public static String fizzBuzz(final int n){

        StringBuilder toReturn = new StringBuilder();

        for (int i= 1; i <= n; i++){
            StringBuilder word = new StringBuilder();

            word.append(getWord(3, i, "Fizz"));
            word.append(getWord(5, i, "Buzz"));

            if (word.length() == 0){
                toReturn.append(String.valueOf(i));
            }else{
                toReturn.append(word);
            }
        }

        return toReturn.toString();
    }

    private static String getWord(final int divisor, final int value, final String word){
        return value % divisor == 0 ? word : "";
    }
}
