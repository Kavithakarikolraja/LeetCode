class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";

        for(String a1 : word1){
            a += a1;
        }

        
        for(String b1 : word2){
            b += b1;
        }
     
     return a.equals(b);
    }
}