class Solution {
    public int findJudge(int n, int[][] trust) {
        List<List<Integer>> a = new ArrayList<>();

        for(int i=0;i<=n;i++)
        {
            a.add(new ArrayList<Integer>());
        }

        for(int i=0;i<trust.length;i++)
        {
            a.get(trust[i][0]).add(trust[i][1]);
        }

        
        for(int i=1;i<a.size();i++)
        {
            if(a.get(i).size()==0)
            {
                boolean found = false;
                for(int j=1;j<a.size();j++)
                {
                   if(i==j) continue;
                    if(!a.get(j).contains(i))
                    {
                        found = true;
                        break;
                    }

                }

                if(!found)
                {
                    return i;
                }
            }
        }

        return -1;
    }
}