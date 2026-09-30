class Solution:
    def reverseWords(self, s):
        words_list = s.split(" ")
        reversed_list = []
        
        for word in words_list:
            reversed_word = word[::-1]
            reversed_list.append(reversed_word)
            
        return " ".join(reversed_list)