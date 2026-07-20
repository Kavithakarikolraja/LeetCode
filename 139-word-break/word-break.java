class TrieNode
{
    TrieNode[] children = new TrieNode[26];
    boolean isEnd = false; 
}
class Solution {
    TrieNode root = new TrieNode();
    
    public void insert(String word)
    {
        TrieNode node = root;

        for(int i=0;i<word.length();i++)
        {
            int pos = word.charAt(i)-'a';
            if(node.children[pos]==null)
            {
                node.children[pos] = new TrieNode();
            }

            node = node.children[pos];
        }
        node.isEnd = true;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        
        for(String w : wordDict)
        {
            insert(w);
        }

        Boolean[] memo = new Boolean[s.length()];

        return dfs(s,0,memo);
    }

    public boolean dfs(String s,int start,Boolean[] memo)
    {
        if(s.length()==start) return true;
        if(memo[start]!=null) return memo[start]; 

        TrieNode node = root;

        for(int i=start;i<s.length();i++)
        {
            int pos = s.charAt(i)-'a';
            if(node.children[pos]==null) break;
            node = node.children[pos];
            if(node.isEnd && dfs(s,i+1,memo))
            {
                return memo[start] = true;
            }
        } 

        return memo[start] = false;
    }
}