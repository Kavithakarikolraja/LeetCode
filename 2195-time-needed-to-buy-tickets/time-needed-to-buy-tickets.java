class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<tickets.length;i++)
        {
            q.add(i);
        }

        int count = 0;

        while(tickets[k]>0)
        {
            count++;
            int val = q.peek();
            q.poll();
            tickets[val] = tickets[val]-1;
            if(tickets[val]!=0)
            {
                q.add(val);
            }
        }

        return count;
    }
}