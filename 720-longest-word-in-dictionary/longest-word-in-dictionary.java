class Solution {
    public String longestWord(String[] words) {
        Set<String> dict = new HashSet<>(Arrays.asList(words));
        
       
        Arrays.sort(words, (a, b) -> 
            a.length() == b.length() ? a.compareTo(b) : b.length() - a.length()
        );
        
        for (String word : words) {
            boolean valid = true;
            for (int i = 1; i < word.length(); i++) {
                if (!dict.contains(word.substring(0, i))) {
                    valid = false;
                    break;
                }
            }
            if (valid) return word;
        }
        return "";
    }
}