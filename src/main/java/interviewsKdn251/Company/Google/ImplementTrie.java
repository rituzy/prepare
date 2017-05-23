package interviewsKdn251.Company.Google;

import interviewsKdn251.Company.Facebook.AddAndSearchWordDataStructureDesign;

/**
 * Created by user on 07.05.2017.
 */
// Implement a trie with insert, search, and startsWith methods.

// Note:
// You may assume that all inputs are consist of lowercase letters a-z.

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
public class ImplementTrie {

    TrieNode root;

    public ImplementTrie() {
        root = new TrieNode(' ');
    }

    public void insert(String toInsert){

        TrieNode current = root;

        for (char ch : toInsert.toCharArray()){
            if (!current.map.containsKey(ch)){
                current.map.put(ch, new TrieNode(ch));
            }

            current = current.map.get(ch);
        }

        current.last = true;
    }

    public boolean search(String toSearch){

        TrieNode current = root;

        for (char ch : toSearch.toCharArray()){
            if (!current.map.containsKey(ch)) return false;
            current = current.map.get(ch);
        }

        return current.last;
    }

    public boolean startsWith(String begin){

        TrieNode current = root;

        for (char ch : begin.toCharArray()){
            if (!current.map.containsKey(ch)) return false;
            current = current.map.get(ch);
        }

        return true;
    }


}
