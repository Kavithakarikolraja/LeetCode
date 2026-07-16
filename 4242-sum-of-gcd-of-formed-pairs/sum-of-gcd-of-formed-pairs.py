import math

class Solution:
    def gcdSum(self, nums: list[int]) -> int:
        list1 = [0] * len(nums)
        gcdResult = [0] * len(nums)

        maximum = nums[0]
        total = 0

        for i in range(len(nums)):
            maximum = max(maximum, nums[i])
            list1[i] = maximum
            gcdResult[i] = math.gcd(nums[i], list1[i])

        left = 0
        right = len(nums)-1
        gcdResult.sort()

        while(left<right):
            total += math.gcd(gcdResult[left],gcdResult[right])
            left+=1
            right-=1



        return total

