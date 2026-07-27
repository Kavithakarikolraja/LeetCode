class Solution {
    public int findCenter(int[][] edges) {

       int n = edges.length+1;

       List<List<Integer>> a = new ArrayList<>();
       for(int i=0;i<=n;i++)
       {
        a.add(new ArrayList<Integer>());
       }

       for(int[] e : edges)
       {
            a.get(e[0]).add(e[1]);
            a.get(e[1]).add(e[0]);
       } 

       for(int i=1;i<a.size();i++)
       {
        if(a.get(i).size()==n-1)
        {
            return i;
        }
       }

       return 0;
    }
}