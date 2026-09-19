class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class MyLinkedList {
   
    // public MyLinkedList() {
        
    // }
    Node head;
    int size = 0;
    public int get(int index) {
     if(index < 0 || index >= size || head == null){
        return -1;
     }
     Node temp = head;
     for(int i = 0; i < index; i++){
        temp = temp.next;
     }   
     return temp.val;
    }
    
    public void addAtHead(int val) {
         Node nn = new Node(val);
        if(head == null){
             head = nn;
             size++;
             return;
        }
            nn.next = head;
            head = nn;
        size++;
    }
    
    public void addAtTail(int val) {
         Node nn = new Node(val);
        if(head == null){
       head = nn;
       size++;
       return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index  > size){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node t = head;
        for(int i = 0; i < index-1; i++){
            t = t.next;
        }
        Node nn = new Node(val);
        nn.next = t.next;
        t.next = nn;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
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