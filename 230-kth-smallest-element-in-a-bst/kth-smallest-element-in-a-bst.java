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
    public int kthSmallest(TreeNode root, int k) {
        
        Set<Integer>  a = new TreeSet<>();
        Queue<TreeNode> q = new LinkedList<>();
		  q.add(root);
		  
		  while(!q.isEmpty())
		  {
			  TreeNode curr = q.poll();
              a.add(curr.val);
			 
			  if(curr.left!=null)
			  {
				  q.add(curr.left);
			  }
			  if(curr.right!=null)
			  {
				  q.add(curr.right);
			  }
		  }
          List<Integer> list = new ArrayList<>(a);
          return list.get(k-1);
    }
}