class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 0 ,line = 1;

        for (int i = 0; i < s.length(); i++) {
            int w = widths[s.charAt(i) - 'a'];
            if (count + w > 100) {
                line++;
                count = w;
            } else {
                count += w;
            }
        }

        return new int[]{line, count};
    }
}