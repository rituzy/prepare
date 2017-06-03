package interviewsKdn251.Company.Google;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 28.05.2017.
 * finds the shortest sentence in the text if exitst
 */
public class FindWordsInText {

    public static String findSubstring(String text, List<String> toFind){
        if (toFind == null || text == null) return "";

        String[] words = text.replace("\n", " ").split(" ");
        Map<String, Integer> wordCounter = new HashMap();

        for (String word : words){
            if (!wordCounter.containsKey(word)){
                wordCounter.put(word, 0);
            }
        }

        for (String word : toFind){
            if (!wordCounter.containsKey(word)){
                return "";
            }
            wordCounter.put(word, wordCounter.get(word) + 1);
        }

        int counter = toFind.size();
        int start = 0;
        int end = 0;
        int minWindowStart = 0;
        int minWindowLen = Integer.MAX_VALUE;

        while (end < words.length){
            String current = words[end];

            if (wordCounter.get(current) > 0){
                counter--;
            }

            wordCounter.put(current, wordCounter.get(current) - 1);
            end++;
            while (counter == 0){
                if (minWindowLen > end - start){
                    minWindowLen = end - start;
                    minWindowStart = start;
                }

                String intCurrent = words[start];
                wordCounter.put(intCurrent, wordCounter.get(intCurrent) + 1);

                if (wordCounter.get(intCurrent) > 0){
                    counter++;
                }

                start++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = minWindowStart ; i < minWindowStart + minWindowLen ; i++){
            sb.append(words[i] + " ");
        }

        return sb.toString();



    }

}
