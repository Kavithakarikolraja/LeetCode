/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class CBTInserter {
    TreeNode root;
    Queue<TreeNode> q;
    public CBTInserter(TreeNode root) {
        this.root = root;
        q = new LinkedList<>();

        Queue<TreeNode> comp = new LinkedList<>();
        comp.add(root);

        while(!comp.isEmpty())
        {
            TreeNode curr = comp.poll();

            if(curr.left!=null) comp.add(curr.left);
            if(curr.right!=null) comp.add(curr.right);

            if(curr.left==null || curr.right==null) q.add(curr);
        }
    }
    
    public int insert(int val) {
        
        TreeNode nn = new TreeNode(val);

        TreeNode curr = q.peek();

        if(curr.left==null)
        {
            curr.left = nn;
        }else
        {
            curr.right = nn;
            q.poll();
        }

        q.add(nn);
        return curr.val;
    }
    
    public TreeNode get_root() {
        
            return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */