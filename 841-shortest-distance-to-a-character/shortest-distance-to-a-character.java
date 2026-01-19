import java.util.*;

class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> positions = new ArrayList<>();
        int idx = 0;

        
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                positions.add(idx);
            }
            idx++;
        }

        int[] res = new int[s.length()];

    
        for (int i = 0; i < s.length(); i++) {
            int minDist = Integer.MAX_VALUE;
            for (int pos : positions) {
                minDist = Math.min(minDist, Math.abs(i - pos));
            }
            res[i] = minDist;
        }

        return res;
    }
}