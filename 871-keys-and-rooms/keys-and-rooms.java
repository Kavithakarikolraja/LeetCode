class Solution {
    int visitedCount = 0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms,0,visited);
        return visitedCount == rooms.size();
    }

    public void dfs(List<List<Integer>> rooms,int source,boolean[] visited)
    {
        visited[source] = true;
        visitedCount++;

        for(int val : rooms.get(source))
        {
            if(!visited[val])
            {
            dfs(rooms,val,visited);
            }
        }
    }
}