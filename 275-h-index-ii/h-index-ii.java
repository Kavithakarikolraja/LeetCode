class Solution {
    public int hIndex(int[] citations) {
         int h_index = 0;

         //Arrays.sort(citations);

        while(true)
        {
            h_index++;
            int count = 0;
            for(int i=0;i<citations.length;i++)
            {
                if(citations[i]>=h_index) 
                {
                    count++;
                    if(count==h_index) break;
                }

            }
            if(count<h_index) break;
           
        }

        return h_index-1;
    }
}