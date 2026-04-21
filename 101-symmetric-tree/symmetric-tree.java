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
    public boolean isSymmetric(TreeNode root) {
        
        TreeNode proc1 = root.left;
        TreeNode proc2 = root.right;

        boolean res = isSymmetric_helper(proc1,proc2);

        return res;

    }

    public boolean isSymmetric_helper(TreeNode proc1,TreeNode proc2){

        if(proc1==null && proc2==null) return true;
        if(proc1 == null || proc2 == null) return false;

        if(proc1.val!=proc2.val) return false;

        return isSymmetric_helper(proc1.left,proc2.right) && isSymmetric_helper(proc1.right,proc2.left);


    
}

}