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
    public int maxLevelSum(TreeNode root) {
        

       // HashMap<Integer,Integer> a = new HashMap<>();
       ArrayList<Integer> a = new ArrayList<>();
        maxLevel(root,0,a);
        int level = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)>max)
            {
                level = i;
                max = a.get(i);
            }
        }

        return level+1;
    }

    public void maxLevel(TreeNode root,int height,ArrayList<Integer> a)
    {
        if(root==null) return;

        if (height >= a.size()) {
            a.add(root.val); 
        } else {
            a.set(height, a.get(height) + root.val); 
        }
        height++;
        maxLevel(root.left,height,a);
        maxLevel(root.right,height,a); 
    }
}