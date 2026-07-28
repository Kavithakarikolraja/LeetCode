class Solution {
    public String smallestPalindrome(String s) {
        
        int[] freq = new int[26];

        for(char c : s.toCharArray())
        {
            freq[c-'a']++;
        }

        String result1 = "";
        String result2 = "";
        String oddResult = "";

        for(int i=0;i<26;i++)
        {
            int val = freq[i];
            String add = String.valueOf((char)('a' + i));

            if((freq[i]&1)==1)
            {
                oddResult = add;
                val -=1;
            }

            int time = val/2;
            result1 += add.repeat(time);
            result2 += add.repeat(time);
        }
        StringBuilder sb = new StringBuilder(result2);
        return result1+oddResult+sb.reverse().toString();
    }
}