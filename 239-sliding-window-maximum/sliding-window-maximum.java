class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] res = new int[nums.length-k+1];
        Deque<Integer> a = new ArrayDeque<>();
        int entry = k;
        int leaving = 0;
        int current = 0;

        int max = Integer.MIN_VALUE;
        a.addFirst(0);

        for(int i=1;i<k;i++)
        {
            

             while(!a.isEmpty() && nums[a.peekLast()]<nums[i])
            {
                a.removeLast();
            }
            a.addLast(i);
        } 

       // a.addFirst(current);
        int index = 0;

        res[index++] = nums[a.peekFirst()];

        for(int i=1;i<=nums.length-k;i++)
        {
           
            if(!a.isEmpty() && a.peekFirst()==leaving) a.removeFirst();

            while(!a.isEmpty() && nums[a.peekLast()]<nums[entry])
            {
                a.removeLast();
            }

            a.addLast(entry);
           
            current = a.peekFirst();
            res[index++] = nums[current];
            entry++;
            leaving++;
        }

    return res;
    }
}