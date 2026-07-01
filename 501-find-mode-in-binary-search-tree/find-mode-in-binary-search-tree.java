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
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer,Integer> a = new HashMap<>();

        inorder(root,a);

        ArrayList<Integer> res = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> e : a.entrySet())
        {
                max = Math.max(max,e.getValue());
        }


        for(Map.Entry<Integer,Integer> e : a.entrySet())
        {
            if(max == e.getValue())
            {
                res.add(e.getKey());
            }
                
        }
       
       int[] arr = new int[res.size()];

       for(int i=0;i<res.size();i++)
       {
        arr[i] = res.get(i);
       }

    return arr;

    }

    public void inorder(TreeNode root,HashMap<Integer,Integer> a)
    {
        if(root==null) return;

        inorder(root.left,a);
        a.put(root.val,a.getOrDefault(root.val,0)+1);
        inorder(root.right,a);
    }
}