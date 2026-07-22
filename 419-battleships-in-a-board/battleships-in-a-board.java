class Solution {
    public int countBattleships(char[][] board) {
        
        int count = 0;

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                boolean left = false;
                boolean top = false;
                if(board[i][j]=='X')
                {
                    if(i==0 || board[i-1][j]!='X') left = true; 
                    if(j==0 || board[i][j-1]!='X') top = true; 
                    
                }

                if(left&&top)
                {
                    count++;
                }
            }
        }

        return count;
    }
}