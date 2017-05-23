package interviewsKdn251.Company.Facebook;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 19.04.2017.
 */
// Implement a trie with insert, search, and startsWith methods.

// Note:
// You may assume that all inputs are consist of lowercase letters a-z.

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
public class ImplementTrie {

    static TrieNode root = new TrieNode(' ');

    public static void insert(String toInsert){
        TrieNode newNode = root;

        for (char ch : toInsert.toCharArray()){
            if (!newNode.keyTNode.containsKey(ch)){
                newNode.keyTNode.put(ch, new TrieNode(ch));
            }
            newNode = newNode.keyTNode.get(ch);
        }

        newNode.last = true;

    }

    public static boolean search(String toFind){

        TrieNode tn = root;

        for (char ch : toFind.toCharArray()){
            if (!tn.keyTNode.containsKey(ch)){
                return false;
            }
            tn = tn.keyTNode.get(ch);
        }

        return tn.last == true;
    }


    public static class  TrieNode{
        Map<Character, TrieNode> keyTNode;
        char ch;
        boolean last;

        public TrieNode(char ch) {
            this.ch = ch;
            keyTNode = new HashMap<>();
            last = false;
        }
    }
}
