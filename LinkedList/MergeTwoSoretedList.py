# Problem: Merge Two sorted Linked List
# Platform: Leetcode
# Link: https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-list-v2&envId=linked-list
# Time Complexity: O(n)
# Space Complexity: O(1)


# Code Below

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        if(list1 is None):
            return list2
        if(list2 is None):
            return list1
        if list1 is not None and list2 is not None :
            if list1.val <= list2.val:
                result=list1
                result.next=self.mergeTwoLists(list1.next, list2)
                return result
            else:
                result=list2
                result.next=self.mergeTwoLists(list1, list2.next)
                return result
        return None
