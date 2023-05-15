class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        word = ''
        words = []
        for element in s:
            if element != ' ':
                word += element
            elif word:
                words.append(word)
                word = ''

        if word:
            words.append(word)

        if words:
            return len(words[-1])
        else:
            return 0;    
        
        