class Solution {
    public int numberOfSpecialChars(String word) {
        
        /*Set<Character> a = new HashSet<>();

        for(Character w : word.toCharArray())
        {
            if(w >= 'A' && w<='z')
            a.add(w);
        }

        int count = 0;

        for(char c : a)
        {
            char s = (char)(c+32);
          
            if(word.indexOf(s)!=-1) count++;
        }

        return count;*/

        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            } else {
                upper[ch - 'A'] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]) {
                count++;
            }
        }

        return count;
    }
}