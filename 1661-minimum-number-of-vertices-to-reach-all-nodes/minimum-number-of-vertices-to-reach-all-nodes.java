class Solution {

    class Node
    {
        int id;
        int od;
      
        Node()
        {
            this.od =0;
            this.id = 0;
        }
        
    }
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        Node[] vertex = new Node[n];
        for(int i=0;i<n;i++)
        {
            vertex[i] = new Node();
        }
        for(int i=0;i<edges.size();i++)
        {
            {
                int source = edges.get(i).get(0);
                int destination = edges.get(i).get(1);
                vertex[source].od++;
                vertex[destination].id++;
            }
        }

      List<Integer> a = new ArrayList<>();


      for(int i=0;i<n;i++)
      {
        if(vertex[i].id==0)
        {
            a.add(i);
        }
      }
    //System.out.print(vertex[2].id);
      return a;
    }
}