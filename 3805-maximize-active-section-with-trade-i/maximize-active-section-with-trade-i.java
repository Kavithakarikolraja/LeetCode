class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        
        String t = "1" + s + "1";
        int n = t.length();

        int totalOnes = 0;
        int maxDelta = 0;

       
        int i = 0;
        while (i < n) {
            char c = t.charAt(i);
            int j = i;
            while (j < n && t.charAt(j) == c) j++;
            int len = j - i;

            if (c == '1') {
                totalOnes += len;
                
                if (i > 0 && j < n && t.charAt(i - 1) == '0' && t.charAt(j) == '0') {
                   
                    int leftZeros = 0;
                    for (int l = i - 1; l >= 0 && t.charAt(l) == '0'; l--) leftZeros++;
                    int rightZeros = 0;
                    for (int r = j; r < n && t.charAt(r) == '0'; r++) rightZeros++;
                    maxDelta = Math.max(maxDelta, leftZeros + rightZeros);
                }
            }
            i = j;
        }

        return totalOnes + maxDelta - 2; 
    }
}
