package interviewsKdn251.Company.Uber;

import interviewsKdn251.Company.Facebook.AddAndSearchWordDataStructureDesign;

/**
 * Created by user on 22.05.2017.
 */
// Implement a trie with insert, search, and startsWith methods.

// Note:
// You may assume that all inputs are consist of lowercase letters a-z.

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
public class ImplementTrie {
    private TrieNode root;

    public ImplementTrie() {
        this.root = new TrieNode(' ');
    }

    public void insert(String s){
        TrieNode cur = root;

        for (char ch : s.toCharArray()){
            if (!cur.map.containsKey(ch)){
                cur.map.put(ch, new TrieNode(ch));
            }
            cur = cur.map.get(ch);
        }

        cur.last = true;
    }

    public boolean startsWith(String s){
        TrieNode cur = root;

        for (char ch : s.toCharArray()){
            if (!cur.map.containsKey(ch)) return false;

            cur = cur.map.get(ch);
        }

        return true;
    }

    public boolean search(String s){
        TrieNode cur = root;

        for (char ch : s.toCharArray()){
            if (!cur.map.containsKey(ch)) return false;

            cur = cur.map.get(ch);
        }

        return cur.last;
    }
}
