class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        return combination(nums);
    }

    public List<List<Integer>> combination(int[] candidates)
    {
        List<List<Integer>> result = new ArrayList<>();
        
            combinationHelper(candidates,0,result,new ArrayList<Integer>());
        
        return result;
    }

    public static void combinationHelper(int[] candidates,int start,List<List<Integer>> result,List<Integer> temp)
    {
       result.add(new ArrayList<Integer>(temp));

        for(int i=start;i<candidates.length;i++)
        {
            temp.add(candidates[i]);
            combinationHelper(candidates,i+1,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}