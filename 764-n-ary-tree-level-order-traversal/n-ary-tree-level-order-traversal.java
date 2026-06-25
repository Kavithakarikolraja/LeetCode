/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> a = new ArrayList<>();
        if(root==null) return a;

        while(!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
            Node curr = q.poll();
            temp.add(curr.val);

            for(Node val : curr.children)
            {
                if(val!=null) q.add(val);
            }
           
            }
             a.add(temp);
        }

        return a;
    }
}