class TrieNode
{
    HashMap<Character,TrieNode> children;
    boolean isEnd;

    TrieNode()
    {
        this.children = new HashMap<>();
        isEnd = false;
    }
}

class Solution {
    List<Integer> a = new ArrayList<>();
    TrieNode root = new TrieNode();

    public void insert(String num)
    {
        TrieNode current = root;

        for(int i=0;i<num.length();i++)
        {
            char c = num.charAt(i);
            if(!current.children.containsKey(c))
            {
                current.children.put(c,new TrieNode());
            }
            current = current.children.get(c);
        }

        current.isEnd = true;

    }
    public List<Integer> lexicalOrder(int n) {
        
        for(int i=1;i<=n;i++)
        {
            insert(String.valueOf(i));
        }

        print();
        return a;
    }

    public void print()
    {
        printHelper(root,new StringBuilder());
    }

    public void printHelper(TrieNode current,StringBuilder sb)
    {
        if(current == null) return;

        if(current.isEnd)
        {
            a.add(Integer.parseInt(String.valueOf(sb.toString())));
        }

        for(Map.Entry<Character,TrieNode> e : current.children.entrySet())
        {
            sb.append(e.getKey());
            printHelper(e.getValue(),sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}