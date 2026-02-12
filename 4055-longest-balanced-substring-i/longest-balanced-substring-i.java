class Solution {
    public int longestBalanced(String s) {

        int maxlen = 0;

        for(int i=0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;

                if(isBalanced(freq)){
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }

    private boolean isBalanced(int[] freq){
        int common = 0;

        for(int c:freq){
            if(c==0) continue;
            if(common==0) common=c;
            if(common!=c) return false;
        }
        return true;
    }
}