class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
    if(left==right){
        return head;
    }

    ListNode prev=null;
    ListNode current = head;
    
    for(int i=0;current!=null && i<left-1;i++){
        prev=current;
        current=current.next;
    }
    
    ListNode last=prev;
    ListNode newEnd = current;
    
    for(int i=0;current!=null && i<right-left+1;i++){
        ListNode temp = current.next;
        current.next=prev;
        prev=current;
        current=temp;
    }
    
    if(last!=null){
        last.next=prev;
    }
    else{
        head=prev;
    }
    
    newEnd.next=current;
    
    return head;
    }
}
