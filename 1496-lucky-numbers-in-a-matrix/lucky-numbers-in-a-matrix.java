class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
       
        for (int i = 0; i < rows; i++) {
            int minVal = Integer.MAX_VALUE;
            int minCol = -1;
            
           
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minCol = j;
                }
            }
            
            
            boolean isMaxInCol = true;
            for (int r = 0; r < rows; r++) {
                if (matrix[r][minCol] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }
            
            if (isMaxInCol) {
                result.add(minVal);
            }
        }
        
        return result;
    }
}