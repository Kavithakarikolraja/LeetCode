class Solution {
    public int findJudge(int n, int[][] trust) {
        List<List<Integer>> a = new ArrayList<>();

        for(int i=0;i<=n;i++)
        {
            a.add(new ArrayList<Integer>());
        }

        List<Integer> track = new ArrayList<>();
        int sum = 0;
    
        for(int i=0;i<trust.length;i++)
        {
            a.get(trust[i][0]).add(trust[i][1]);
            if(!track.contains(trust[i][0]))
            {
                sum += trust[i][0];
                track.add(trust[i][0]);
            }
        }

        int tot = ((n*(n+1))/2);
        int diff = tot-sum;
        if(diff>n)
        {
             return -1;
        }

        
       
                boolean found = false;
                for(int j=1;j<a.size();j++)
                {
                   if(diff==j) continue;
                    if(!a.get(j).contains(diff))
                    {
                        found = true;
                        break;
                    }

                }

                if(!found)
                {
                    return diff;
                }
            
        

        return -1;
    }
}