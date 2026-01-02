class Solution {
    public int[] getNoZeroIntegers(int n) {

        int[] a = new int[2];
        
        for(int i=1;i<=n/2;i++){
            int a1 = i;
            int b1 = n-i;
            String val1 = String.valueOf(a1);
            String val2 = String.valueOf(b1);

            if(val1.contains("0")|| val2.contains("0")){
                continue;
            }
                a[0] = a1;
                a[1] = b1;
                break;
        }

        return a;
    }
}