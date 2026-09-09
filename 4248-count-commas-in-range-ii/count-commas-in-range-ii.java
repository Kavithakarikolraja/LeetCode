class Solution {
    public long countCommas(long n) {


        long comma_count = 0;

        for(long i=1000;i<=n;i*=1000){
            comma_count += (n-i)+1;
        }

        return comma_count;
    }
}