class MyLinkedList {

    Node head,tail;
    int count;
    private class Node{
        int data;
        Node next;
        Node prev;

        Node(int value){
            data = value;
        next = null;
        prev = null;
        }
    }

    public MyLinkedList() {

        head=tail=null;
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

        if(head==null){
            head=tail=n1;
            
        }else{
        

        n1.next = head;
        head.prev = n1;
        head = n1;
        }
        count++;
}
    
    public void addAtTail(int val) {

        Node n1 = new Node(val);
        

        if(head==null){
           head =tail = n1;
        }else{
           tail.next = n1;
           n1.prev = tail;
           tail = n1;
        }
        count++;
        
    }
    
    public void addAtIndex(int index, int val) {
        
        Node n1 = new Node(val);
        
         if (index < 0 || index > count) return;

         if(index==count){
            addAtTail(val);
            return;
         }

        if(index==0){
            n1.next = head;
            head.prev = n1;
            head = n1;
        }else{

        
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        n1.next = temp.next;
        temp.next.prev = n1;

        temp.next = n1;
        n1.prev = temp;
        }

        count++;

    }
    
    public void deleteAtIndex(int index) {
        
        if(index<0||index>=count) return;
        
        if (index == 0) { 
            if (count == 1) {
                 head = tail = null;
                  } 
                  else { 
                    head = head.next; 
                    head.prev = null; 
                    } 
                    count--; 
                    return; 
                    }

        if(index==count-1){
            tail = tail.prev;
            tail.next = null;
            count--;
            return;
        }
   

        Node temp = head;

        for(int i=0;i<index-1;i++){
        temp=temp.next;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;
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