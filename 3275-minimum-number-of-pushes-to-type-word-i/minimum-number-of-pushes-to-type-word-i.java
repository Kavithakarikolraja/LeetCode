class Solution {
    public int minimumPushes(String word) {
        
       int count = 0;
       for(int i=0;i<word.length();i++)
       {
            if(i>=0 && i<=7) count += 1;
            else if(i>=8 && i<=15) count+=2;
            else if(i>=16 && i<=23) count +=3;
            else count  += 4;
       }

       return count;
    }
}