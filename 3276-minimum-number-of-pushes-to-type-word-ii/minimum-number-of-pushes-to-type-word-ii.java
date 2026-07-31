class Solution {
    public int minimumPushes(String word) {
        
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i=0;i<word.length();i++) {
            freqMap.put(word.charAt(i), freqMap.getOrDefault(word.charAt(i), 0) + 1);
        }

       
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int count = 0;
        int result = 0;
        for(Map.Entry<Character,Integer> a : list)
        {
            if(count>=0 && count<=7) result += 1*a.getValue();
            if(count>=8 && count<=15) result += 2*a.getValue();
            if(count>=16 && count<=23) result += 3*a.getValue();
            if(count>=24 && count<=25) result += 4*a.getValue();
            count++;
        }

        return result;
    }
}