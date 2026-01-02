class Solution {
    public int[] getNoZeroIntegers(int n) {

        /*int[] a = new int[2];
        
        for(int i=1;i<=n/2;i++){
            //int a1 = i;
            //int b1 = n-i;
            String val1 = String.valueOf(i);
            String val2 = String.valueOf(n-i);

            if(val1.contains("0")|| val2.contains("0")){
                continue;
            }
                a[0] = i;
                a[1] = n-i;
                break;
        }

        return a;*/

        for(int a=1;a<n;a++){
            int b = n-a;
            if(!valid(a)&&!valid(b)){
                return new int[] {a,b};
            }
        }
        return new int[0];
    }

    private boolean valid(int n){
        if(n>0){
            while(n!=0){
                if(n%10==0){
                    return true;
                }
                n /=10;
            }
        }
        return false;
    }
}