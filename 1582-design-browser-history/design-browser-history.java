 class node{
        String data;
        node next;
		node prev;
		
		node( String url )
		{
			data = url;
			next = null;
			prev = null;
		}
        
    }
	
    class BrowserHistory {

        
		node curr;
		
		
    public BrowserHistory(String homepage) {
    curr = new node(homepage); 
    
   
   
    }
    
    public void visit(String url) {
        node n1 = new node(url);
			curr.next = n1;
			n1.prev = curr;
            curr = n1;
			
    }
    
    public String back(int steps) {

       
		   
		   while(curr.prev!=null &&  steps > 0  ){
			   curr = curr.prev;
			   steps--;
		   }
		   
		  
		   return curr.data ;	
          
		   
		   
    }
    
    public String forward(int steps) {
		  
		   
		   while(  curr.next!=null && steps > 0 ){
			   curr = curr.next;
			   steps--;
		   }
		   
		  
		   
		return curr.data ;	
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */