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

    class Pair {
        int leftHeight;
        int rightHeight;

        Pair(int l, int r) {
            leftHeight = l;
            rightHeight = r;
        }
    }

    Map<TreeNode, Pair> map = new HashMap<>();
    Map<Integer, Integer> ans = new HashMap<>();

    public int[] treeQueries(TreeNode root, int[] queries) {
        buildHeight(root);
        dfs(root, 0, 0);

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = ans.get(queries[i]);
        }
        return res;
    }

    // returns height of subtree
    private int buildHeight(TreeNode node) {
        if (node == null)
            return -1;

        int left = buildHeight(node.left);
        int right = buildHeight(node.right);

        map.put(node, new Pair(left, right));

        return Math.max(left, right) + 1;
    }

    // depth = depth of current node
    // up = maximum height after removing current subtree
    private void dfs(TreeNode node, int depth, int up) {
        if (node == null)
            return;

        ans.put(node.val, up);

        Pair p = map.get(node);

        if (node.left != null) {
            int rightHeight = (node.right == null) ? -1 : p.rightHeight;
            dfs(node.left,
                depth + 1,
                Math.max(up, depth + 1 + rightHeight));
        }

        if (node.right != null) {
            int leftHeight = (node.left == null) ? -1 : p.leftHeight;
            dfs(node.right,
                depth + 1,
                Math.max(up, depth + 1 + leftHeight));
        }
    }
}