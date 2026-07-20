class Solution:
    def compressedString(self, word: str) -> str:

        i = 0
        res =""

        while i < len(word):
            current = word[i]
            count = 0

            while i < len(word) and current == word[i]:
                i+=1
                count+=1
                if count == 9:
                    res += str(count)+current
                    count = 0
            if count >=1:
                res += str(count)+current
        return res        