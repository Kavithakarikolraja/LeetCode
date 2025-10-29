class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowelSet = new HashSet<>();
        for (char vowel : "aeiouAEIOU".toCharArray()) {
            vowelSet.add(vowel);
        }

        int start = 0;
        int end = s.length() - 1;
        char[] characters = s.toCharArray();

        while (start < end) {
            boolean isStartVowel = vowelSet.contains(characters[start]);
            boolean isEndVowel = vowelSet.contains(characters[end]);

            if (!isStartVowel) {
                start++;
            } else if (!isEndVowel) {
                end--;
            } else {
                char temp = characters[start];
                characters[start] = characters[end];
                characters[end] = temp;
                start++;
                end--;
            }
        }

        return new String(characters);
    }
}