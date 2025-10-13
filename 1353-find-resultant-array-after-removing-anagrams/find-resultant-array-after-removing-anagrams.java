class Solution {
    public List<String> removeAnagrams(String[] words) {

     
        List<String> result = new ArrayList<>();
        result.add(words[0]); 
        for (int i = 1; i < words.length; i++) {
            String prev = result.get(result.size() - 1);
            String curr = words[i];

            if (!sortString(prev).equals(sortString(curr))) {
                result.add(curr);
            }
        }

        return result;
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


}