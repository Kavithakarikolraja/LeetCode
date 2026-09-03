class Solution {
    public int longestCycle(int[] edges) {

        /*  List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            if (edges[i] != -1) adj.get(i).add(edges[i]);
        }
        
        int c = -1;
        
        for (int i = 0; i < edges.length; i++) {
            int[] count = new int[1];
            boolean[] found = new boolean[1];
            boolean[] visited = new boolean[edges.length];
            int[] depth = new int[edges.length];   // NEW: track depth of each node
            track(i, i, 0, count, visited, adj, found, depth);
            //System.out.print(count[0] + " ");
            if (found[0]) {
                c = Math.max(c, count[0]);
            }
        }
        return c;
        }
        
        public void track(int parent, int source, int depthVal,
                      int[] count, boolean[] visited,
                      List<List<Integer>> adj, boolean[] found, int[] depth) {
        if (found[0] || visited[source]) return;
        
        visited[source] = true;
        depth[source] = depthVal;   // record depth
        count[0]++;
        
        for (int j = 0; j < adj.get(source).size(); j++) {
            int next = adj.get(source).get(j);
            if (visited[next]) {
                found[0] = true;
                // FIX: compute cycle length properly
                count[0] = depthVal - depth[next] + 1;
                return;
            }
            track(parent, next, depthVal + 1, count, visited, adj, found, depth);
        }*/

        List<List<Integer>> a = new ArrayList<>();
        boolean[] tracker = new boolean[edges.length]; 

        for (int i = 0; i < edges.length; i++) {
            a.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            if (edges[i] == -1) {
                continue;
            }
            a.get(i).add(edges[i]);
        }

        int count = -1;
        for (int i = 0; i < edges.length; i++) {
            List<Integer> cy = new ArrayList<>();
            if(!tracker[i])
            {
            int parent = i;
            boolean[] visited = new boolean[edges.length];
            int minC = 0;
            Queue<Integer> q = new LinkedList<>();
            boolean found = false;

            q.add(parent);
            visited[parent] = true;
            cy.add(parent);

            while (!q.isEmpty()) {

                int val = q.poll();
                if(tracker[val]) continue;

                for (int j = 0; j < a.get(val).size(); j++) {
                    if (a.get(val).get(j) == parent) {
                        found = true;
                        for(int v : cy)
                        {
                            tracker[v] = true;
                        }
                        break;
                    }
                    if (!visited[a.get(val).get(j)]) {
                        visited[a.get(val).get(j)] = true;
                        q.add(a.get(val).get(j));
                        cy.add(a.get(val).get(j));
                    }
                }
                minC++;
            }

            if (found) {
                if (count < minC) {
                    count = minC;
                }
            }
         }
        }

        return count;
    }
}
