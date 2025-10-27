class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
      
    if (sum > 9 * num) return "";

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < num; i++) {
        for (int d = 9; d >= 0; d--) {
            int remainingDigits = num - i - 1;
            int minPossibleSum = 0;
            int maxPossibleSum = 9 * remainingDigits;
            if (sum - d >= minPossibleSum && sum - d <= maxPossibleSum) {
                result.append(d);
                sum -= d;
                break;
            }
        }
    }
    return sum == 0 ? result.toString() : "";

    }
}