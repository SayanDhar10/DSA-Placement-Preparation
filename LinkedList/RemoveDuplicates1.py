# Problem: Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
# Platform: Leetcode
# Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/?envType=problem-list-v2&envId=linked-list
# Time Complexity: O(n)
# Space Complexity: O(1)


# Code Below

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        #if(head is  None or head.next is None):
        #   return head
        temp=head
        
        while(temp!=None and temp.next !=None):
            if(temp.val==temp.next.val):
                temp.next=temp.next.next
            else:
                temp = temp.next 
            
        return head
        