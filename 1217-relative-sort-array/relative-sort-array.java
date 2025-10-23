class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int[] freq = new int[1001];
        List<Integer> result = new ArrayList<>();

        for(int n : arr1){
            freq[n]++;
        }

        for(int n : arr2){
           while(freq[n]>0){
            result.add(n);
            freq[n]--;
           }
            
        }

       for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                result.add(i);
                freq[i]--;
            }
        }


        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}