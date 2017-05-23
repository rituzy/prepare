package interviewsKdn251.Company.Facebook;

import sun.text.normalizer.Trie;

/**
 * Created by user on 16.04.2017.
 */
// Design a data structure that supports the following two operations:

// void addWord(word)
// bool search(word)
// search(word) can search a literal word or a regular expression string containing only letters a-z or ..
// A . means it can represent any one letter.

// For example:

// addWord("bad")
// addWord("dad")
// addWord("mad")
// search("pad") -> false
// search("bad") -> true
// search(".ad") -> true
// search("b..") -> true

// Note:
// You may assume that all words are consist of lowercase letters a-z.
public class AddAndSearchWordDataStructureDesign {
     // own data for storage
    public static class TrieNode{
        // array for each letter in alphabet(indexing by char number)
        public TrieNode[] children = new TrieNode[26];
        // the word
        String item = "";
    }

    static TrieNode root = new TrieNode();

    public static void addWord(String str){
        TrieNode node = root;

        for (char c : str.toCharArray()){
            // initialize every children for corresponding char in the word(than we
            // will be finding if there are  childs for the chars from word to find
            if (node.children[c - 'a'] == null){
                node.children[c - 'a'] = new TrieNode();
            }
            //! this string initializes current node as the child with last character  !
            node = node.children[c - 'a'];
        }

        // the word itself
        node.item = str;
    }

    public static boolean search(String str){
        return match(str.toCharArray(), 0, root);
    }

    private static boolean match(char[] chars, int level, TrieNode node) {
        // the last step in recursive function - if the string of node is not empty than true
        if (level == chars.length){
            return !node.item.equals("");
        }
        // for not a '.' we check if there is a child for current char from the word to find and
        // if yes we call this function for checking the next char and so on until stopping on the strings
        // above. Here it finds correct Node from childs array
        if (chars[level] != '.'){
            return node.children[chars[level] - 'a'] != null
                    && match(chars, level + 1, node.children[chars[level] - 'a']);
        }else{
            // for '.' needs to check all combinations of matching with any child for this node
            for (int i = 0; i < node.children.length; i++){
                if (node.children[i] != null && match(chars, level + 1, node.children[i])){
                    return true;
                }
            }
        }

        return false;
    }


}
