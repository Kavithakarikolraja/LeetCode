class Solution {
    public int numberOfUniqueGoodSubsequences(String binary) {
         int mod = 1000000007;
        long end0 = 0, end1 = 0;
        boolean hasZero = false;

        for (char c : binary.toCharArray()) {
            if (c == '0') {
                hasZero = true;
                end0 = (end0 + end1) % mod;
            } else {
                end1 = (end0 + end1 + 1) % mod;
            }
        }

        return (int) ((end0 + end1 + (hasZero ? 1 : 0)) % mod);
    }
}
