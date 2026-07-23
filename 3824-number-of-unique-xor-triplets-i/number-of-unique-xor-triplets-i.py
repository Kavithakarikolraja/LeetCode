class Solution:
    def uniqueXorTriplets(self, nums: List[int]) -> int:
        
        n =  len(nums)

        if n <=2:
            return n
        result = set()

        val = 2
        while val <= max(nums):
            val *= 2
        return val