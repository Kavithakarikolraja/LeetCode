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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> a = new ArrayList<>();
        post(root,a);
        return a;
    }

    public void post(Node root,ArrayList<Integer> a)
    {
        if(root==null) return;

        for(Node curr : root.children)
        {
            post(curr,a);
        }
        a.add(root.val);

    }
}