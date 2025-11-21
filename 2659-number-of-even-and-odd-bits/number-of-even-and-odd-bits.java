class Solution {
    public int[] evenOddBit(int n) {
        
        int pos=1;
        int even =0;
        int odd = 0;

        while(n!=0){
            if((n&1)==1){
                if((pos&1)==1) odd++;
                else even++;
            }
            pos++;
            n >>= 1;
        }

        return new int[]{odd,even};
    }
}