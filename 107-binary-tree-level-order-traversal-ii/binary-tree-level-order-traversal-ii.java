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
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        Queue<TreeNode> q =new LinkedList<>();;
        Stack<ArrayList<Integer>> a = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        q.add(root);

        

        while(!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> in_list = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr = q.poll();
                in_list.add(curr.val);
                if(curr.left!=null) 
                {
                    q.add(curr.left);
                }
                if(curr.right!=null) 
                {
                    q.add(curr.right);
                }
            }
            a.push(in_list);
        }
        while(!a.isEmpty())
        {
            res.add(a.pop());
        }

        return res;
    }
}