class Solution {
    public int[] sumZero(int n) {
        
        int[] a = new int[n];
        int index = 0;

        for(int i=1;i<=n/2;i++){
            a[index++] = -i;
            a[index++] = i;
        }

        if (n % 2 == 1) {
            a[index] = 0;
        }

       return a;
    }
}