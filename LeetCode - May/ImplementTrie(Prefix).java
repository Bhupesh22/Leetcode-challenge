class TrieNode{
    boolean end;
    Map<Character, TrieNode> root;
    
    TrieNode(){
        end = false;
        root = new HashMap<>();
    }
}

class Trie {
    
    TrieNode n_node;
    
    /** Initialize your data structure here. */
    
	public Trie() {
        n_node = new TrieNode();
    }

    /** Inserts a word into the trie. */
    
	public void insert(String word) {
        TrieNode node = n_node;
        for(char c: word.toCharArray()){
            node.root.putIfAbsent(c, new TrieNode());
            node = node.root.get(c);
        }
        node.end = true;
    }

    /** Returns if the word is in the trie. */
    
	public boolean search(String word) {
        TrieNode node = n_node;
        for(char c: word.toCharArray()){
            if(!node.root.containsKey(c)) 
                return false;
            node = node.root.get(c);
        }
        return node.end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    
	public boolean startsWith(String prefix) {
        TrieNode node = n_node;
        for(char c: prefix.toCharArray()){
            if(!node.root.containsKey(c)) 
                return false;
            node = node.root.get(c);
        }
        return true;
    }
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */