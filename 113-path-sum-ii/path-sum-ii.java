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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        

        List<List<Integer>> res = new ArrayList<>();
        path(root,new ArrayList<Integer>() ,res,0,targetSum);
        return res;
    }


    public static void path(TreeNode root,ArrayList<Integer> path_holder,List<List<Integer> >res,int sum,int targetSum)
    {
        if(root==null) return ;

        path_holder.add(root.val);
        sum += root.val;

        if(root.left==null && root.right==null)
        {
            if(sum==targetSum)
            {
                res.add(new ArrayList<Integer>(path_holder));
            }
        }
        else
        {
            path(root.left,path_holder,res,sum,targetSum);
            path(root.right,path_holder,res,sum,targetSum);
        }

        path_holder.remove(path_holder.size()-1);
    }
}