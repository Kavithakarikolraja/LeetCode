import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Create a copy of the score array and sort it in descending order
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < n / 2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[n - 1 - i];
            sorted[n - 1 - i] = temp;
        }

      
        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                rankMap.put(sorted[i], "Gold Medal");
            } else if (i == 1) {
                rankMap.put(sorted[i], "Silver Medal");
            } else if (i == 2) {
                rankMap.put(sorted[i], "Bronze Medal");
            } else {
                rankMap.put(sorted[i], String.valueOf(i + 1));
            }
        }

      
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }

        return result;
    }
}