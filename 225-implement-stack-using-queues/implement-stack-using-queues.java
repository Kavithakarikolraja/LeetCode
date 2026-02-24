class MyStack {

    Queue<Integer> a;
    public MyStack() {
        a = new LinkedList<>();
    }
    
    public void push(int x) {
        a.add(x);
        for (int i = 1; i < a.size(); i++) {
            a.add(a.remove());
        }

    }
    
    public int pop() {
        return a.remove();
    }
    
    public int top() {
        return a.peek();
    }
    
    public boolean empty() {
        return a.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */