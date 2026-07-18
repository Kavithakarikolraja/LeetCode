class Solution:
    def findGCD(self, nums: List[int]) -> int:

        maximum = max(nums)
        minimum = min(nums)

        return math.gcd(minimum,maximum)

   
    """ 
def gcd(a:int,b:int)->int:
        if(b==0):
            return a
        return gcd(b,a%b) """
        