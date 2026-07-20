class Solution {
    public String compressedString(String word) {
        
        String res ="";
        int i = 0;

        while(i<word.length())
        {
            char current = word.charAt(i);
            int count = 0;

            while(i<word.length() && word.charAt(i)==current)
            {
                i++;
                count++;
                if(count==9)
                {
                    res += count+String.valueOf(current);
                    count = 0;
                }
            }
            
            if(count>=1)
            res += count+String.valueOf(current);


        }

        return res;
    }
}