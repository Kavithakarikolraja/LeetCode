/*class MinStack {
    Stack<Integer> s;
    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        int min = s.get(0);
        for(int i = 1; i < s.size();i++){
            min = Math.min(s.get(i),min);
        }
        return min;
    }
}/*

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 class MinStack {
    Node head,head1;
    class Node{
        int data;
        Node next;
        Node(int value){
            data = value;
            next = null;
        }
    }
    public MinStack() {
        head = null;
        head1 = null;
    }
    
    public void push(int val) {
        Node newNode1 = new Node(val);
        Node newNode2 = new Node(val);
        if(head == null){
            head = newNode1;
        }
        else{
            newNode1.next = head;
            head = newNode1;
        }
        if(head1 == null){
            head1 = newNode2;
        }
        else{
            if(head1.data >= newNode2.data){
                newNode2.next = head1;
                head1 = newNode2;
            }
        }
    }
    
    public void pop() {
        if(head == null){
            return;
        }
        if(head.data == head1.data){
            head1 = head1.next;
        }
        head = head.next;
    }
    
    public int top() {
        return head.data;
    }
    
    public int getMin() {
        return head1.data;
    }
}
 