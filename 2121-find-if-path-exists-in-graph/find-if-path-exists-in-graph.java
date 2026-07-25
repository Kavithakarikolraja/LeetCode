class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

     List<List<Integer>> path = new ArrayList<>();

     for(int i=0;i<n;i++)
     {
        path.add(new ArrayList<>());
     }

     for(int[] e : edges)
     {
        path.get(e[0]).add(e[1]);
        path.get(e[1]).add(e[0]);
     }

     Queue<Integer> q = new LinkedList<>();
     q.add(source);
    
     boolean[] visited = new boolean[n];
     visited[source] = true;

    while(!q.isEmpty())
    {
        int node   = q.poll();

        if(node==destination) return true;

        for(int neighbor : path.get(node))
        {
            if(visited[neighbor]!=true)
            {
                q.add(neighbor);
                visited[neighbor] = true;
            }
        }


    }


    return false;

    }
}