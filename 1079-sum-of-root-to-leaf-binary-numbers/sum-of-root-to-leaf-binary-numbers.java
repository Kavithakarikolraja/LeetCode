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

    public int sumRootToLeaf(TreeNode root) {
        

        ArrayList<String> op = new ArrayList<>();
        String res = "";
        sumRoot(root,op,res);
        int sum = 0;

        for(int i=0;i<op.size();i++)
        {
           
            String val = op.get(i);
            sum += Integer.parseInt(val,2);
           
        }

        return sum;
    }

    public void sumRoot(TreeNode root,ArrayList<String>op,String sum )
    {
            if(root==null) return ;

            sum += String.valueOf(root.val);

            if(root.left==null && root.right==null)
            {
                op.add(sum);
            }
            else
            {
                sumRoot(root.left,op,sum);
                sumRoot(root.right,op,sum);
            }

            sum = sum.substring(0,sum.length()-1);
    }
}