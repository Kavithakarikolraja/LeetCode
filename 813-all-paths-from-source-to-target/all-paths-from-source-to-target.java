class Solution {
    int n;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

    n = graph.length;
     List<List<Integer>> a = new ArrayList<>();

     List<List<Integer>> edge = new ArrayList<>();
     for(int i=0;i<graph.length;i++)
     {
        edge.add(new ArrayList<Integer>());
     }

     for(int i=0;i<graph.length;i++)
     {
        for(int j=0; j<graph[i].length;j++)
        {
            edge.get(i).add(graph[i][j]);
        }
     }

     
   
     dfs(edge,new ArrayList<Integer>(),a,0);

     return a;   
    }

    public static void dfs(List<List<Integer>> edge,List<Integer> temp,List<List<Integer>> result,int source)
    {
        temp.add(source);
        if(source == edge.size()-1)
        {
            result.add(new ArrayList<>(temp));
        }
        for(int j=0;j<edge.get(source).size();j++)
        {
            //temp.add(edge.get(source).get(j));
            dfs(edge,temp,result,edge.get(source).get(j));
        }

        temp.remove(temp.size()-1);
    }
}