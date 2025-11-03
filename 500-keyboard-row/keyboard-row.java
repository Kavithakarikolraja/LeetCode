class Solution {
    public String[] findWords(String[] words) {
        
        Set<Character> row1 = new HashSet<>();
        Set<Character> row2 = new HashSet<>();
        Set<Character> row3 = new HashSet<>();

        for(char val : "qwertyuiopQWERTYUIOP".toCharArray()) row1.add(val);
        for(char val : "asdfghjklASDFGHJKL".toCharArray()) row2.add(val);
        for(char val : "zxcvbnmZXCVBNM".toCharArray()) row3.add(val);
        
        List<String> result = new ArrayList<>();      

        for (String word : words) {
            Set<Character> targetRow = null;
            char firstChar = word.charAt(0);

            if (row1.contains(firstChar)) targetRow = row1;
            else if (row2.contains(firstChar)) targetRow = row2;
            else if (row3.contains(firstChar)) targetRow = row3;

            boolean isValid = true;
            for (char ch : word.toCharArray()) {
                if (!targetRow.contains(ch)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) result.add(word);
        }

        return result.toArray(new String[0]);
  
    }
}