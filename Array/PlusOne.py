# Problem: Plus One
# Platform: Leetcode
# Link: https://leetcode.com/problems/plus-one/submissions/1678878335/?envType=problem-list-v2&envId=array
# Time Complexity: O(n)
# Space Complexity: O(1)


# Code Below
class Solution(object):
    def plusOne(self, digits):
       n = len(digits)
       for i in range(n-1,-1,-1):
        if digits[i] < 9:
            digits[i] += 1
            return digits
        digits[i] = 0
       return [1] + digits