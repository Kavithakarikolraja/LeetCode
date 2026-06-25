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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        if(a.size() != b.size()) return false;

        similar(root1,a);
        similar(root2,b);

        return a.equals(b);

        

        
    }

    public void similar(TreeNode root1,ArrayList<Integer> a)
    {
        if(root1==null) return;

        if(root1.left == null && root1.right==null ) a.add(root1.val);
       
        similar(root1.left,a);
        similar(root1.right,a);

    }
}