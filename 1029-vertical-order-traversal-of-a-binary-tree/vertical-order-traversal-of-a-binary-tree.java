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
 //import com.google.common.collect.TreeMultimap;
class Solution {
    class Pair {
        TreeNode node;
        int hd;  
        int lvl;  
        Pair(TreeNode node, int hd, int lvl) {
            this.node = node;
            this.hd = hd;
            this.lvl = lvl;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            TreeNode node = curr.node;
            int hd = curr.hd;
            int lvl = curr.lvl;

            map.putIfAbsent(hd, new TreeMap<>());
            map.get(hd).putIfAbsent(lvl, new PriorityQueue<>());
            map.get(hd).get(lvl).add(node.val);

            if (node.left != null) q.add(new Pair(node.left, hd - 1, lvl + 1));
            if (node.right != null) q.add(new Pair(node.right, hd + 1, lvl + 1));
        }

        List<List<Integer>> res = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> levels : map.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> pq : levels.values()) {
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            res.add(col);
        }
        return res;
    }
}
