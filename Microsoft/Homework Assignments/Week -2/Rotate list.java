public ListNode rotateRight(ListNode head, int k) {
    if(head==null || head.next==null || k<=0){
        return head;
    }
    int size=1;
    ListNode curr = head;
    while(curr.next!=null){
        curr=curr.next;
        size++;
    }
    
    if(k==size || k%size==0){
        return head;
    }
    
    curr.next=head;
    ListNode temp =head;
    int rot = k%size;
    int length = size-rot;
    for(int i=0;i<length-1;i++){
        temp=temp.next; 
    }
    
    head=temp.next;
    temp.next=null;
    return head;
    
}
