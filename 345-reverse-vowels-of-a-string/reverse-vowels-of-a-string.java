class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        String vowels = "aeiouAEIOU";

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char startChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            boolean isStartVowel = vowels.indexOf(startChar) != -1;
            boolean isEndVowel = vowels.indexOf(endChar) != -1;

            if (isStartVowel && isEndVowel) {
              
                sb.setCharAt(start, endChar);
                sb.setCharAt(end, startChar);
                start++;
                end--;
            } else if (isStartVowel) {
                end--;
            } else if (isEndVowel) {
                start++;
            } else {
                start++;
                end--;
            }
        }

        return sb.toString();
    }
}