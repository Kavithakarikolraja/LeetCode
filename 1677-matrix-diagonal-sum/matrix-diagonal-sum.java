class Solution {
    public int diagonalSum(int[][] mat) {

        if(mat.length==1) return mat[0][0];
        

        int sum = 0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum += mat[i][j];
                }
            }
        }

        int val= mat.length-1;

        for(int i=0;i<mat.length;i++){
            sum += mat[i][val--];
        }

        if((mat.length&1)==1){
            sum -= mat[(mat.length/2)][(mat.length/2)];
        }

        return sum;
    }
}