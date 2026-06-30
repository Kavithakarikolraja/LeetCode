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
    public TreeNode balanceBST(TreeNode root) {
        
        ArrayList<Integer> a = new ArrayList<>();

        inorder(root,a);

        return buildTree(a,0,a.size()-1);
    }

    public static void inorder(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null) return;

        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
    public TreeNode buildTree(ArrayList<Integer> a, int left, int right){

        if (left > right) return null;

        int mid = (left+right)/2;

        TreeNode root = new TreeNode(a.get(mid));

        root.left = buildTree(a, left, mid-1);
        root.right = buildTree(a, mid+1, right);

        return root;
    }
}