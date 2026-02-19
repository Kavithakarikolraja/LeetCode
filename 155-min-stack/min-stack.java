class MinStack {

    Node head;
    Node head1;

    class Node{
            int data;
            Node next;
            Node(int val){
              data = val;
              next = null;
            }
        }

    public MinStack() {
        
        
        
    }
    
    public void push(int val) {

        Node n1 = new Node(val);
        Node n2 = new Node(val);
        

        if(head==null){
            head = n1;
        }else{
            n1.next  =head;
            head = n1;
        }
        if(head1==null){
            head1 = n2;
        }else{
            if(head1.data>=n2.data){
                n2.next = head1;
                head1 = n2;
            }
        }
    }
    
    public void pop() {
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */