class Solution {

    class TrieNode {
        TrieNode[] children;
        boolean isEnd;
        ArrayList<String> neighbor;

        TrieNode() {
            this.children = new TrieNode[26];
            this.isEnd = false;
            this.neighbor = new ArrayList<>();
        }
    }

    TrieNode head = new TrieNode();

    public void buildTrie(String word) {
        TrieNode curr = head;

        for (char w : word.toCharArray()) {
            int pos = w - 'a';
                if (curr.children[pos] == null) {
                    curr.children[pos] = new TrieNode();
                }
                curr = curr.children[pos];
                if (curr.neighbor.size() < 3) {
                    curr.neighbor.add(word);
                }
            }
            curr.isEnd = true;

        }
    

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);

        for (String p : products) {
            buildTrie(p);
        }

          List<List<String>> a = new ArrayList<>();
        TrieNode curr = head;
          for(char c : searchWord.toCharArray())
          {
                if(curr!=null)
                {
                    curr = curr.children[c-'a'];
                }
                a.add(curr == null ? new ArrayList<>() : curr.neighbor);
                
          }


          return a;

    }
}