class Solution {
    public double myPow(double x, int n) {
        
        long num = n; 
        if (num < 0) {
            x = 1 / x;
            num = -num; 
        }
        return exp_by_squaring(x, num);
    }

    private double exp_by_squaring(double x, long n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            return exp_by_squaring(x * x, n / 2);
        } else {
            return x * exp_by_squaring(x * x, (n - 1) / 2);
        }
    }

    }
