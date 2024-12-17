#Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
#Since the result may be very large, so you need to return a string instead of an integer.

class Solution(object):
    def largestNumber(self, nums):
        nums_str = list(map(str, nums))
        
        def compare(x, y):
            
            if x + y > y + x:
                return -1  
            elif x + y < y + x:
                return 1   
            else:
                return 0  
        
        nums_str.sort(key=cmp_to_key(compare))
    
        largest_num = ''.join(nums_str)
        
        if largest_num[0] == '0':
            return '0'
        
        return largest_num

solution = Solution()
nums = [10, 2]
print(solution.largestNumber(nums))        
