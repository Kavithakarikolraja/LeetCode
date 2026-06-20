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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Stack<TreeNode> q1 = new Stack<>();
        Stack<TreeNode> q2 = new Stack<>();
        List<List<Integer>> a = new ArrayList<>();
        q1.push(root);

        if(root==null) return a;

        while(!q1.isEmpty() || !q2.isEmpty())
        {
            
            List<Integer> in_list = new ArrayList<>();
            if(q2.isEmpty())
            {
                while(!q1.isEmpty())
                {
                    TreeNode curr = q1.pop();
                    if(curr!=null)
                    {
                    in_list.add(curr.val);
                    }
                    
                    if(curr.left!=null)
                    {
                        q2.push(curr.left);
                    }
                    if(curr.right!=null)
                    {
                        q2.push(curr.right);
                    }
                    
                }
            }else
            {
              while(!q2.isEmpty())
                {
                    TreeNode curr = q2.pop();
                    if(curr!=null)
                    {
                    in_list.add(curr.val);
                    }
                     if(curr.right!=null)
                    {
                        q1.push(curr.right);
                    }
                     if(curr.left!=null)
                    {
                        q1.push(curr.left);
                    }
                }  
            }
            a.add(in_list);
        }

        
    return a;
    }
}