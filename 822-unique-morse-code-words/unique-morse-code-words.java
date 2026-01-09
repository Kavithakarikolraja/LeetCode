class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> seen = new HashSet<>();
        for (String w : words) {
            StringBuilder morseWord = new StringBuilder();
            for (char ch : w.toCharArray()) {
                morseWord.append(codes[ch - 'a']);
            }
            seen.add(morseWord.toString());
        }
        return seen.size();
    }
}