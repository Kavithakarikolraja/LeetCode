class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
        List<String> a = new ArrayList<>();


        for(String q : queries)
        {
           
           for(int i=0 ; i < dictionary.length; i++)
           {
            String d = dictionary[i];
           if (q.length() != d.length()) continue; // lengths must match

                int diff = 0; // reset for each dictionary word
                for (int pos = 0; pos < q.length(); pos++) {
                    if (q.charAt(pos) != d.charAt(pos)) {
                        diff++;
                        if (diff > 2) break; // stop early
                    }
                }

                if (diff <= 2) {
                    a.add(q);
                    break; // no need to check other dictionary words
                }
            }
        }

        return a;
    }
}