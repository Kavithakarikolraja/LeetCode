class Solution {
    public List<Integer> findAnagrams(String s, String p) {



        ArrayList<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;
        
        int[] freq_p = new int[26];

        for(int p_ind=0;p_ind<p.length();p_ind++){
            freq_p[p.charAt(p_ind)-'a']++;
        }

         int[] freq_s = new int[26];

        for(int s_ind=0;s_ind<p.length();s_ind++){
            freq_s[s.charAt(s_ind)-'a']++;
           
        }
            if(Arrays.equals(freq_s,freq_p)){
                ans.add(0);
            }

        for(int j=p.length();j<s.length();j++){
            freq_s[s.charAt(j-p.length())-'a']--;
            freq_s[s.charAt(j)-'a']++;

           if (Arrays.equals(freq_p, freq_s)) {
                ans.add(j - p.length() + 1);
            }

        }

         return ans;
    }
}