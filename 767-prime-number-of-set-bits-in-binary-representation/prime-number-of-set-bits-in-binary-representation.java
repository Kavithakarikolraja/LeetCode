class Solution {
    public int countPrimeSetBits(int left, int right) {
        int primeCount = 0;

        for (int i = left; i <= right; i++) {
            int count = Integer.bitCount(i); 
            if (isPrime(count)) {
                primeCount++;
            }
        }

        return primeCount;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}