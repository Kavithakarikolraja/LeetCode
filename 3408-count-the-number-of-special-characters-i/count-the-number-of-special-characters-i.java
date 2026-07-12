class Solution {
    public int numberOfSpecialChars(String word) {
        
        Set<Character> a = new HashSet<>();

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

        return count;
    }
}