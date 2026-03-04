class Solution {
    public double myPow(double x, int n) {
        
        long  num = n;
        if(num<0){
            x = 1/x;
            num = -num;
        }

        double ans = 1;
        double  current_value = x;

        while(num>0){
            if(num%2==1){
                ans = ans*current_value;
            }
            current_value = current_value*current_value;
            num /=2;
        }

    return ans;
    }
}