class Solution {
    public int nthUglyNumber(int n) {
     int[] arr = new int[n];
	 int[] mul = {2,3,5};
	 int[] count = {0,0,0};
     arr[0] = 1;
     int ind;
	 ind = 1;

     while(ind<n)
	 {
	 int min = Integer.MAX_VALUE;
	 
	 
	 int temp[] = new int[3];
	 
	 for(int index = 0; index < 3; index++)
	 {
	   int val = arr[count[index]] * mul[index];
       temp[index]	= val; 
	     if(min > val)
	     {
	        min = val;
	        
	     }
		 
	 }
	 
	    arr[ind] = min;
		for(int i = 0 ;i < 3;i++)
		{
			if(temp[i] == min)
			{
				count[i]++;
			}
		}
		
        ind ++;	 
	 
 	 
	 
	 }
 

      return arr[n-1];
    }
}