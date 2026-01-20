class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        HashMap<Integer,Integer> a = new HashMap<>();

        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
                a.put(i,count);
            }
        }

       int[] ans = a.entrySet()
               .stream()
               .sorted(Comparator.comparing(Map.Entry<Integer, Integer>::getValue)
                                 .thenComparing(Map.Entry::getKey))
               .limit(k)
               .mapToInt(Map.Entry::getKey)
               .toArray();

               int[] re = new int[k];


               for(int i=0;i<k;i++){
                re[i] = ans[i];
               }

               return re;

    }
}