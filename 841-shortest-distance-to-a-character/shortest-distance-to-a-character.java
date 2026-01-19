class Solution {
    public int[] shortestToChar(String s, char target) {
        int length = s.length();
        int[] result = new int[length];
        
      
        int lastSeen = Integer.MAX_VALUE / 2; 
        for (int index = 0; index < length; index++) {
            if (s.charAt(index) == target) {
                lastSeen = index;
            }
            result[index] = Math.abs(index - lastSeen);
        }
        
        
        lastSeen = Integer.MAX_VALUE / 2;
        for (int index = length - 1; index >= 0; index--) {
            if (s.charAt(index) == target) {
                lastSeen = index;
            }
            result[index] = Math.min(result[index], Math.abs(index - lastSeen));
        }
        
        return result;
    }
}