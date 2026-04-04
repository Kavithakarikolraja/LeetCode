class Solution {
  
    public int coinChange(int[] coinValues, int targetAmount) {
        if (targetAmount < 1) {
            return 0;
        }

        int[] minCoins = new int[targetAmount + 1];
        Arrays.fill(minCoins, targetAmount + 1);
        minCoins[0] = 0;

        for (int currentAmount = 1; currentAmount <= targetAmount; currentAmount++) {
            for (int coin : coinValues) {
                if (coin <= currentAmount) {
                    minCoins[currentAmount] = Math.min(minCoins[currentAmount], 
                                                       minCoins[currentAmount - coin] + 1);
                }
            }
        }

        return minCoins[targetAmount] > targetAmount ? -1 : minCoins[targetAmount];
    }
}
