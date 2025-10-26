class Solution {
    public long removeZeros(long n) {
        
        String a = String.valueOf(n);

        long val = 0;



        for(int i=0;i<a.length();i++){

    int re = a.charAt(i) - '0';

     if(re==0) {
        continue;
     }else{
            val = val*10+re;}

        }

        return val;
    }
}