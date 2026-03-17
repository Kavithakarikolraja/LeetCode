class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                String s1 = s.substring(i, j);

               
                if (s1.length() == 0) continue;
                if(s1.charAt(0) != s1.charAt(s1.length() - 1)) continue;

                
                
                    StringBuilder sb = new StringBuilder(s1);
                    if (sb.reverse().toString().equals(s1)) {
                        if (ans.length() < s1.length()) {
                            ans = s1;
                            if (ans.length() == s.length()) {
                                return ans; 
                            }
                        }
                    }
                
            }
        }
        return ans;
    }
}