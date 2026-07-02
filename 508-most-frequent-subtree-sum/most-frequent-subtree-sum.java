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
    public int[] findFrequentTreeSum(TreeNode root) {
        
        HashMap<Integer,Integer> a = new HashMap<>();

        inorder(root,a);

        int max = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> e : a.entrySet())
        {
            max = Math.max(max,e.getValue());
        }

        ArrayList<Integer> temp = new ArrayList<>();

        
        for(Map.Entry<Integer,Integer> e : a.entrySet())
        {
            if(e.getValue()==max)
            temp.add(e.getKey());
        }

        int[] res = new int[temp.size()];

        for(int i=0;i<temp.size();i++)
        {
            res[i] = temp.get(i);
        }

        return res;
    }

    public int inorder(TreeNode root,HashMap<Integer,Integer> a)
    {
        if(root==null) return 0;

        int left = inorder(root.left,a);
        int right = inorder(root.right,a);

        int sum = left + right + root.val ;

        a.put(sum,a.getOrDefault(sum,0)+1);

        return left+right+root.val;
    }

}