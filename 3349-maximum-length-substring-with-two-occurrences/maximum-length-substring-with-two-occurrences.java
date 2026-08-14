class Solution {
    public int maximumLengthSubstring(String s) {
        
        int maxLength = 0;
        int i = 0;
        int j = 0;
        int[] freq = new int[26];

        while(j<s.length())
        {
            char c = s.charAt(j);

            if(freq[c-'a']<2)
            {
                freq[c-'a']++;
                j++;
            }
            else
            {
                maxLength = Math.max(maxLength,j-i);
                freq[s.charAt(i)-'a']--;
                i++;
            }
        }

        maxLength = Math.max(maxLength,j-i);

        return maxLength;
    }
}