class Solution {
    public int[] getNoZeroIntegers(int n) {

        int[] a = new int[2];
        
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

        return a;
    }
}