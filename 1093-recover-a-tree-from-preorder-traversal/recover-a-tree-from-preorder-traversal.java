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
    int index = 0;
    public TreeNode recoverFromPreorder(String traversal) {

            return recover(traversal,0);
    }

    public TreeNode recover(String traversal,int depth)
    {
        
		int n = traversal.length();
		int i = index;
		int d = 0;
		
		while(i<n && traversal.charAt(i) == '-')
		{
			i++;
			d++;
		}
		
		if(depth != d) return null;
		
		int val = 0;
		
		while(i<n && Character.isDigit(traversal.charAt(i)))
		{
			val = val*10 + traversal.charAt(i)-'0';
			i++;
		}
		
		index = i;
		
		TreeNode node = new TreeNode(val);
		
		node.left = recover(traversal,depth+1);
		node.right = recover(traversal,depth+1);
		
		return node;
    }
}