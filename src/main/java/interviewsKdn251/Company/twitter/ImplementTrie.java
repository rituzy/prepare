package interviewsKdn251.Company.twitter;

import interviewsKdn251.Company.Facebook.AddAndSearchWordDataStructureDesign;

/**
 * Created by user on 21.05.2017.
 */
// Implement a trie with insert, search, and startsWith methods.

// Note:
// You may assume that all inputs are consist of lowercase letters a-z.
public class ImplementTrie {
    TrieNode root;

    public ImplementTrie() {
        root = new TrieNode(' ');
    }

    public void insert(String str){
        TrieNode current = root;

        for (char ch : str.toCharArray()){
            if (!current.map.containsKey(ch)){
                current.map.put(ch, new TrieNode(ch));
            }
            current = current.map.get(ch);
        }

        current.last = true;
    }

    public boolean startsWith(String str){
        TrieNode current = root;

        for (char ch : str.toCharArray()){
            if (!current.map.containsKey(ch)){
                return false;
            }
            current = current.map.get(ch);
        }

        return true;
    }

    public boolean search(String str){
        TrieNode current = root;

        for (char ch : str.toCharArray()){
            if (!current.map.containsKey(ch)){
                return false;
            }
            current = current.map.get(ch);
        }

        return current.last;
    }
}
