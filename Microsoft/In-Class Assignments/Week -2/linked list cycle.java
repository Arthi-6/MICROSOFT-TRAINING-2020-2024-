bool hasCycle(struct ListNode *head) {
    struct ListNode *slow=head;
    struct ListNode *fast=head;
    if(head==NULL || head->next==NULL){
        return false;
    }
    while(fast->next && fast->next->next){
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast){
            return true;
        }
    }
    return false;
}
