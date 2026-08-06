class Solution {
    public int smallestNumber(int n, int t) {
        
        int i = 10;
        int val = n;
        while(i>=0)
        {
            int temp = val;
            int prod = 1;
            while(temp!=0)
            {
                prod *= temp%10;
                temp /= 10;
            }

            if(prod%t==0)
            {
                return val;
            }
            val++;
            i--;
        }

        return 0;
    }
}