class Solution {
    public int countPrimes(int n) {

        if(n==1||n==0) return 0;
        

        boolean[] check = new boolean[n+1];
        Arrays.fill(check,true); 
        int count = 0;

        check[0] = false;
        check[1] = false;

        //count -= n/2;

        for(int i=4;i<n;i+=2){
            check[i] = false;
        }

        for(int i=3;i*i<n;i+=2){
            if(check[i]==false){
                continue;
            }
            int jump = i<<1;
            for(int j=i*i;j<n;j+=jump){
                //count--;
                if(check[j]==true)
                check[j] =  false;
            }
        }

        for(int i=0;i<n;i++){
            if(check[i]==true) count++;
        }

        return count;
    }
}