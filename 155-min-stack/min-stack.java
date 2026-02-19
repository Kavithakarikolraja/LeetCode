class MinStack {
    
   Stack<Integer>  a;  
   Stack<Integer> min;

    public MinStack() {
       a = new Stack<>();
       min = new Stack<>();
       
    }
    
    public void push(int val) {
       a.push(val);
       if(min.isEmpty()||min.peek()>=val){
        min.push(val);
       }
    }
    
    public void pop() {
        if(a.isEmpty()){
            return;
        }
    
        if(a.peek().equals(min.peek())){
            min.pop();
        }
        a.pop();
    }
    
    public int top() {
       if(a.isEmpty()){
            return 0;
        }
        return a.peek();
    }
    
    public int getMin() {
        if(min.isEmpty()){
            return 0;
        }
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */