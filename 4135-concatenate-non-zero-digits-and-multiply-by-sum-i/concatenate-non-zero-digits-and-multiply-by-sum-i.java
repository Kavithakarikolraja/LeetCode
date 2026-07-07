class Solution {
    public long sumAndMultiply(int n) {
       
       int sum = 0;
       int x = 0;
       int temp = n;
       int pos = 1;
       

       while(temp>0)
       {
        int rem = temp%10;
        if(rem != 0)
        {
            x = x + rem*pos;
            sum += rem;
            pos *= 10;
        }
        temp /= 10;
        
       }


       
       return (long) sum * x;

    }
}