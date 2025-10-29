class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels =new HashSet<>();
        for(char ch :"aeiouAEIOU".toCharArray()){
            vowels.add(ch);
        }
        int left=0;
        int right=s.length()-1;
        char[] chars = s.toCharArray();

        while(left<right){
            if(!vowels.contains(chars[left])){
                left++;
            }
            else if(!vowels.contains(chars[right])){
                right--;
            }
            else{
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
        }

        return new String(chars);

    }
}