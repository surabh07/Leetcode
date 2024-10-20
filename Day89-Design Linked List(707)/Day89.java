class MyLinkedList {

    private static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    public MyLinkedList() {
    }
    
    public int get(int index) {
        
        if(index < 0 || index >= size){
            return -1;
        }

        Node temp = head;

        for(int i=0;i<index;i++){
            temp = temp.next;
        }

    return temp.val;
    }

     private Node getNodeAtIndex(int index){
        if(index < 0 || index >= size){
            return null;
        }
        
        Node temp = head;

        for(int i=0;i<index;i++){
            temp = temp.next;
        }

    return temp;
    }
    
    public void addAtHead(int val) {
        Node n1 = new Node(val);
        n1.next = head;
        head = n1;
        if(size == 0){
            tail = head;
        }

    size = size + 1;
    }
    
    public void addAtTail(int val) {
        Node n1 = new Node(val);
        if(size == 0){
            addAtHead(val); 
        }
        else{
            tail.next = n1;
            tail = n1;
            size++;
        }
    
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }

        else if(index==0){  
            addAtHead(val);
        }

        else if(index==size){
            addAtTail(val);
        }

        else{
            Node n1 = new Node(val);
            Node previousNode = getNodeAtIndex(index-1);
            n1.next=previousNode.next;
            previousNode.next = n1;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >=size){
            return;
        }

        else if(size == 1){
            head = null;
            tail = null;
        }

        else if(index == 0){
            head = head.next;
        }

        else if(index == size-1){
            Node prev = getNodeAtIndex(index-1);
            prev.next = null;
            tail = prev;
        }

        else{
            Node prev = getNodeAtIndex(index-1);
            prev.next = prev.next.next;
        }
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
