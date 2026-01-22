class MyLinkedList {

    Node head;
    int count;
    private class Node{
        int data;
        Node next;

        Node(int value){
            data = value;
           // next = null;
        }
    }

    public MyLinkedList() {

        head = null;
        count = 0;
    }
    
    public int get(int index) {

       if(index<0||index>=count) return -1;
        Node temp = head;
       
    for(int i=0;i<index;i++,temp = temp.next);
    return temp.data;

    }
    
    public void addAtHead(int val) {
        
        Node n1 = new Node(val);

        n1.next = head;
        head = n1;
        count++;
}
    
    public void addAtTail(int val) {

        Node n1 = new Node(val);
        Node temp = head;

        if(head==null){
           head = n1;
        }else{
           for(;temp.next!=null;temp = temp.next);
           temp.next = n1;
        }
        count++;
        
    }
    
    public void addAtIndex(int index, int val) {
        
        Node n1 = new Node(val);
        
         if (index < 0 || index > count) return;

        if(index==0){
            n1.next = head;
            head = n1;
        }else{

        
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        n1.next = temp.next;
        temp.next = n1;
        }

        count++;

    }
    
    public void deleteAtIndex(int index) {
        
        if(index<0||index>=count) return;
        if (index == 0) { 
        head = head.next;
    }else{

        Node temp = head;

        for(int i=0;i<index-1;i++,temp=temp.next);

        temp.next = temp.next.next;
    }
        count--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */