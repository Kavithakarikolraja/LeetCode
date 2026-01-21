class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        if(deck.length<2) return false;
        

        int[] freq = new int[10001];

        for(int num:deck){
             freq[num]++;
        }

       int gcd = 0;
        for (int f : freq) {
            if (f > 0) {
                gcd = gcd(gcd, f);
            }
        }

        
        return gcd >= 2;
    }

   
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    
}