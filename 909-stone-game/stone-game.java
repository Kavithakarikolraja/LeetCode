class Solution {
    public boolean stoneGame(int[] piles) {
        
      /*  int alice = 0;
        int bob = 0;

        boolean turn = true;

        int left = 0;
        int right = piles.length-1;

        while(left<=right)
        {
            if(piles[left]>piles[right])
            {
                if(turn) 
                {
                    alice += piles[left];
                }
                else
                {
                    bob += piles[left];
                }
                left++;
            }
            else
            {
             if(turn) 
                {
                    alice += piles[right];
                }
                else
                {
                    bob += piles[right];
                }
                right--;
            }

            turn = !turn;
        }

        return alice > bob;*/

        return true;
    }
}