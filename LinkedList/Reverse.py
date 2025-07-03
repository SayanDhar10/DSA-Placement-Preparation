# Problem: Given the head of a singly linked list, reverse the list, and return the reversed list.
# Platform: Leetcode
# Link: https://leetcode.com/problems/reverse-linked-list/description/?envType=problem-list-v2&envId=linked-list
# Time Complexity: O(n)
# Space Complexity: O(1)


# Code Below

class Solution(object):
    def reverseList(self, head):
        if(head is None or head.next is None):
            return head
        prev = None
        current = head
        while current !=None:
            next_node=current.next
            current.next=prev
            prev=current
            current=next_node
        return prev
        