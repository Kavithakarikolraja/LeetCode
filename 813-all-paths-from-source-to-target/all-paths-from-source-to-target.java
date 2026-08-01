class Solution {
  
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

     List<List<Integer>> a = new ArrayList<>();

    

     
   
     dfs(graph,new ArrayList<Integer>(),a,0);

     return a;   
    }

    public static void dfs(int[][] graph,List<Integer> temp,List<List<Integer>> result,int source)
    {
        temp.add(source);
        if(source == graph.length-1)
        {
            result.add(new ArrayList<>(temp));
        }
        for(int j=0;j<graph[source].length;j++)
        {
            
            dfs(graph,temp,result,graph[source][j]);
        }

        temp.remove(temp.size()-1);
    }
}