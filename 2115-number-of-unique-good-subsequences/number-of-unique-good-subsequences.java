class Solution {
    public int numberOfUniqueGoodSubsequences(String binary) {
        final int MOD = 1_000_000_007;
        long endWith0 = 0; 
        long endWith1 = 0; 
        boolean hasZero = false;

        for (char c : binary.toCharArray()) {
            if (c == '0') {
               
                endWith0 = (endWith0 + endWith1) % MOD;
                hasZero = true;
            } else {
                
                endWith1 = (endWith0 + endWith1 + 1) % MOD;
            }
        }

        long result = (endWith0 + endWith1 + (hasZero ? 1 : 0)) % MOD;
        return (int) result;
    }
}
