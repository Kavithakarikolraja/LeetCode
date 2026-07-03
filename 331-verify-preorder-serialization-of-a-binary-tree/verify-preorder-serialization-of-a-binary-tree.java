class Solution {
    public boolean isValidSerialization(String preorder) {
        
        String[] in = preorder.split(",");

        int count = 1;

        for(String a : in)
        {
            if(count==0) return false;

            if(a.equals("#")) count--;
            else count++;
        }
        return count==0;
    }
}