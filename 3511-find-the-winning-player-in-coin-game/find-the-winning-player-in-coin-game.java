class Solution {
    public String winningPlayer(int x, int y) {
        

        boolean alice = false;

        while(x>=1 && y>=4)
        {  
                y -= 4;
                x -= 1;
                if(alice)
                {
                    alice = false;
                }else
                {
                    alice = true;
                }

        }

        if(alice)
        {
            return "Alice";
        }

        return "Bob";
    }
}