class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        return combination(nums);
    }

     public List<List<Integer>> combination(int[] candidates)
    {
        List<List<Integer>> result = new ArrayList<>();
        combinationHelper(candidates,result,new ArrayList<Integer>(),0);
        return result;
    }

    public void combinationHelper(int[] candidates,List<List<Integer>> result,List<Integer> temp,int start)
    {
      
        
            ArrayList<Integer> a =new ArrayList<>(temp);
            Collections.sort(a);
            if(!result.contains(a))
            {
             result.add(new ArrayList<Integer>(a));
            
            }
        

        for(int i = start;i<candidates.length;i++)
        {
             if (i > start && candidates[i] == candidates[i - 1])
                continue;
            temp.add(candidates[i]);
           
            combinationHelper(candidates,result,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}