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
    int pos = 0;
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        
        /*Set<Integer>  a = new TreeSet<>();
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
          return list.get(k-1);*/

        pos = k;
        inorder(root);
        return res;
    }

    public int inorder(TreeNode root)
    {
        if(root==null) return 0;
        
        inorder(root.left);
        pos--;

        if(pos==0)
        {
            res = root.val;
            return res;
        }
        inorder(root.right);

        return res;
    }
}