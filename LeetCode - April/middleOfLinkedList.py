class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        current=head
        size=0
        while(current):
            size+=1
            current=current.next
        
        current=head
        for i in range(size//2):
            current=current.next
        return current