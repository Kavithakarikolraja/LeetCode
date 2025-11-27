class Solution {
    public String longestWord(String[] wordList) {
        Set<String> wordSet = new HashSet<>();
        for (String word : wordList) {
            wordSet.add(word);
        }

        String result = "";

        for (String word : wordList) {
          
            if (word.length() < result.length() ||
               (word.length() == result.length() && word.compareTo(result) > 0)) {
                continue;
            }

            boolean isValid = true;
            for (int len = 1; len < word.length(); len++) {
                String prefix = word.substring(0, len);
                if (!wordSet.contains(prefix)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result = word;
            }
        }

        return result;
    }
}