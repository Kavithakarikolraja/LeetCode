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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<List<Integer>> op = new ArrayList<>();
       path(root,new ArrayList<Integer>(),op);
        List<String> result = new ArrayList<>();

        for(int i=0;i<op.size();i++)
        {
            String s = "";
        
            for(int j=0;j<op.get(i).size();j++)
            {
                
                   
                s += op.get(i).get(j);
                if(j!=op.get(i).size()-1)
                {
                    s += "->";
                }
            }
                result.add(s);
        }
        

       return result; 

    }

    public void path(TreeNode root,ArrayList<Integer> ip,List<List<Integer>> op)
    {
        if(root==null) return;

        ip.add(root.val);

        if(root.left==null && root.right == null)
        {
            op.add(new ArrayList<Integer>(ip)); 
            
        }else
        {
            path(root.left,ip,op);
            path(root.right,ip,op);
        }

        ip.remove(ip.size()-1);

    }
}