class Solution {
    public boolean isPowerOfThree(int n) {

        if(n<=0)
        return false;

        while (n != 1) {
            if (n % 3>0) {
                return false; 
            }
            n = n / 3;
        }
        return true; 
    

        

        
        
        
        /*int sum = 1; 
        while(n>0){
            n=n/3;;
        }

        if(n==0)
        return true;
        else
        return false;*/

        
        /*while(n>0){
            if(n%3==0){
                return true;
            }
            n /=3;
        }
        return false;*/
    }
}