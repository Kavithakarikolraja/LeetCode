class Solution {
    public int maxProduct(int n) {
        
       
       
        String temp = String.valueOf(n);
        char[] c = temp.toCharArray();
        Arrays.sort(c);
        
         int max = c[c.length-1]-'0';
      
        int max2 = c[c.length-2]-'0';
        
        return max2*max;

    }
}