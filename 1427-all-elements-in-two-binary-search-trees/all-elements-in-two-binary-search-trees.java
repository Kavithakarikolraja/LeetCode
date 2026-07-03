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
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        inorder(root1,a);
        inorder(root2,b);
        int i = 0;
        int j = 0;
        List<Integer> res = new ArrayList<>();

        while(i < a.size() && j < b.size())
        {
            if(a.get(i) < b.get(j))
            {
                res.add(a.get(i));
                i++;
            }else
            {
                res.add(b.get(j));
                j++;
            }
        }

        if(i < a.size())
        {
            while(i < a.size())
            {
                res.add(a.get(i));
                i++;
            }
        }else
        {
             while(j < b.size())
            {
                res.add(b.get(j));
                j++;
            }
        }
        return res;
    }

    public void inorder(TreeNode root,ArrayList<Integer> store)
    {
        if(root==null) return;

        inorder(root.left,store);
        store.add(root.val);
        inorder(root.right,store);

    }
    
}