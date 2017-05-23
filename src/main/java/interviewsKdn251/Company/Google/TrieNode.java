package interviewsKdn251.Company.Google;

import java.util.HashMap;

/**
 * Created by user on 07.05.2017.
 */
public class TrieNode {
    HashMap<Character, TrieNode> map;
    char character;
    boolean last;

    public TrieNode(char character) {
        map = new HashMap<>();
        last = false;
        this.character = character;
    }

}
