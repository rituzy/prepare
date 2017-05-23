package interviewsKdn251.Company.twitter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 21.05.2017.
 */
public class TrieNode {
    char ch;
    Map<Character, TrieNode> map;
    boolean last;

    public TrieNode(char ch) {
        this.ch = ch;
        map = new HashMap<>();
        last = false;
    }
}
