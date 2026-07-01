/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			TreeNode curr = q.poll();
			
			if(curr==null)
			{
				sb.append("#,");
				continue;
			}
			sb.append(curr.val).append(",");
			
			q.add(curr.left);
			q.add(curr.right);
		}
		
		return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         if(data.charAt(0) == '#') return null;
        Queue<TreeNode> q = new LinkedList<>();
		String[] arr = data.split(",");
		int n = arr.length;

		
		TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
		q.add(root);
		int i = 1;
		
		while(!q.isEmpty())
		{
			TreeNode curr = q.poll();
			
			if(i<n&& !arr[i].equals("#"))
			{
				curr.left = new TreeNode(Integer.parseInt(arr[i]));
				q.add(curr.left);
			}
			i++;
			
			if(i<n && !arr[i].equals("#"))
			{
				curr.right = new TreeNode(Integer.parseInt(arr[i]));
				q.add(curr.right);
			}
			i++;
		}
		
		return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;