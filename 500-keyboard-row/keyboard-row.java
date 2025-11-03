class Solution {
    public String[] findWords(String[] words) {
        Map<Character, Integer> rowMap = new HashMap<>();
        for (char ch : "qwertyuiopQWERTYUIOP".toCharArray()) rowMap.put(ch, 1);
        for (char ch : "asdfghjklASDFGHJKL".toCharArray()) rowMap.put(ch, 2);
        for (char ch : "zxcvbnmZXCVBNM".toCharArray()) rowMap.put(ch, 3);

        List<String> result = new ArrayList<>();

        for (String word : words) {
            int row = rowMap.get(word.charAt(0));
            boolean isValid = true;

            for (int i = 1; i < word.length(); i++) {
                if (rowMap.get(word.charAt(i)) != row) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) result.add(word);
        }

        return result.toArray(new String[0]);
    }
}